package com.finzly.utilitybillpay.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finzly.utilitybillpay.dao.BillDao;
import com.finzly.utilitybillpay.dao.CustomerDao;
import com.finzly.utilitybillpay.entity.Bill;
import com.finzly.utilitybillpay.entity.Customer;

@Service
public class BillService {

	@Autowired
	private BillDao billDao;
	
	@Autowired
	CustomerDao customerDao;

	public List<Bill> getAllBillDetails() {
		return billDao.getAllBillDetails();
	}

	public List<Bill> generateBillForOnlineMode(Bill bill) {
		List<Customer> list=customerDao.getAllCustomerDetails();
		String name="";
		LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = null ;
		for(Customer customer : list)
		{
			if(customer.getCustomerId()==bill.getCustomerId())
			{
				name=customer.getCustomerName();
				dueDate = customer.getDueDate();
				break;
			}
		}
        int daysUntilDue = (int) ChronoUnit.DAYS.between(currentDate, dueDate);
        double afterDiscountAmount=0.0;
        double discount=0.0;
        if(daysUntilDue>=0)
        {
        	discount=0.1*bill.getUnitConsumption()*41.5;
        	afterDiscountAmount=(bill.getUnitConsumption()*41.5)-discount;
        }
        else {
        	discount=0.05*bill.getUnitConsumption()*41.5;
        	afterDiscountAmount=(bill.getUnitConsumption()*41.5)-discount;
        }

        Bill b=new Bill();
        b.setCustomerId(bill.getCustomerId());
        b.setCustomerName(name);
        b.setAmount(afterDiscountAmount);
        b.setBillDueDate(dueDate);
        b.setUnitConsumption(bill.getUnitConsumption());
		return billDao.addBill(b);
	}

	public List<Bill> generateBillForOfflineMode(Bill bill) {
		List<Customer> list=customerDao.getAllCustomerDetails();
		String name="";
		LocalDate currentDate = LocalDate.now();
        LocalDate dueDate = null ;
		for(Customer customer : list)
		{
			if(customer.getCustomerId()==bill.getCustomerId())
			{
				name=customer.getCustomerName();
				dueDate = customer.getDueDate();
				break;
			}
		}
        int daysUntilDue = (int) ChronoUnit.DAYS.between(currentDate, dueDate);
        double afterDiscountAmount=0.0;
        double discount=0.0;
        if(daysUntilDue>=0)
        {
        	discount=0.05*bill.getUnitConsumption()*41.5;
        	afterDiscountAmount=(bill.getUnitConsumption()*41.5)-discount;
        }
        else {
        	afterDiscountAmount=(bill.getUnitConsumption()*41.5);
        }
        

        Bill b=new Bill();
        b.setCustomerId(bill.getCustomerId());
        b.setCustomerName(name);
        b.setAmount(afterDiscountAmount);
        b.setBillDueDate(dueDate);
        b.setUnitConsumption(bill.getUnitConsumption());
		return billDao.addBill(b);
	}
}
