import { Component, OnInit } from '@angular/core';
import { Customer } from '../model/customer';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  customerData:any[]=[];
    isSelect:boolean=false;
    customerobj=<Customer>{};
  constructor(private service:HttpService,
     private router:Router) { }

  ngOnInit(): void {
    this.GetAllRecord();
  }

  GetAllRecord(){
    this.service.getAllRecord()
    .subscribe((response:any)=>{
      console.log(response);
      this.customerData=response;
    })
  }

  navigateToFileUpload(): void {
    this.router.navigate(['/file-upload']); // Navigate to the FileUploadComponent route
  }

}
