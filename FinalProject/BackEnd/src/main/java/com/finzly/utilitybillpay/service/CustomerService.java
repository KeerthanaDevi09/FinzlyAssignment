package com.finzly.utilitybillpay.service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.finzly.utilitybillpay.dao.CustomerDao;
import com.finzly.utilitybillpay.entity.Customer;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.common.record.Record;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public String addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	public List<Customer> getAllCustomerDetails() {
		return customerDao.getAllCustomerDetails();
	}

	public String uploadBulkData(MultipartFile file) throws IOException {
	    InputStream inputStream = file.getInputStream();
	    CsvParserSettings setting = new CsvParserSettings();
	    setting.setHeaderExtractionEnabled(true);
	    CsvParser parser = new CsvParser(setting);
	    List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
	    
	    for (Record record : parseAllRecords) {
	        Customer customer = new Customer();
	        customer.setCustomerId(Integer.parseInt(record.getString("customerId")));
	        customer.setCustomerName(record.getString("customerName"));
	        customer.setCustomerGmail(record.getString("customerGmail"));
	        customer.setOtp(record.getString("otp"));     
	        customer.setCustomerMobileNumber(Long.parseLong(record.getString("customerMobileNumber")));
	        String dateString = record.getString("dueDate");
	        String[] dateComponents = dateString.split("-");
	        if (dateComponents.length == 3) {
	            int year = Integer.parseInt(dateComponents[2]);
	            int month = Integer.parseInt(dateComponents[1]);
	            int day = Integer.parseInt(dateComponents[0]);
	            LocalDate dueDate = LocalDate.of(year, month, day);
	            customer.setDueDate(dueDate);
	        }
	        customer.setUnitConsumption(Double.parseDouble(record.getString("unitConsumption")));
	        customerDao.saveCustomerDetails(customer);
	    }
	    
	    return "Bulk data upload successfully";
	}

}
