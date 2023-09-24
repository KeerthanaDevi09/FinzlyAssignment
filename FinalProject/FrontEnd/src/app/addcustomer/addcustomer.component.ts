import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { DatePipe } from '@angular/common';

@Component({
  selector: 'app-addcustomer',
  templateUrl: './addcustomer.component.html',
  styleUrls: ['./addcustomer.component.css']
})
export class AddcustomerComponent implements OnInit {

  isButtonDisabled: boolean = false;
  constructor(private service:HttpService,
    private router:Router,private datePipe: DatePipe) { }

  ngOnInit(): void {
  }

  onSubmit(f:NgForm){
   
    
    let obj={
      customerId:f.value.customerId,
      customerName:f.value.customerName,
      customerMobileNumber:f.value.customerMobileNumber,
      customerGmail:f.value.customerGmail,
      dueDate:this.datePipe.transform(f.value.dueDate, 'yyyy-MM-dd'),
      unitConsumption:f.value.unitConsumption,
      otp:f.value.otp

    }

    this.isButtonDisabled = !f.valid;

    this.service.addCustomerRecord(obj)
    .subscribe((response:any)=>{
      console.log(response);
      this.router.navigate(['/home']);
    })


  }

}
