import { Component, OnInit, OnDestroy } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-employee-login',
  templateUrl: './employee-login.component.html',
  styleUrls: ['./employee-login.component.css']
})
export class EmployeeLoginComponent implements OnInit,OnDestroy {

  isShow:boolean=true;
  incorrect:string='';
  constructor(private service:HttpService,
              private router:Router) { }

  ngOnInit(): void {
    document.body.className="front-background";
  }
  ngOnDestroy(): void {
    document.body.className='';
  }

  onShow(){
    this.isShow=!this.isShow;
  }

  onSubmit(f:NgForm){

    let obj={
      employeeId:f.value.employeeId,
      otp:f.value.otp
    }

    this.service.login(obj)
    .subscribe((response:any)=>{
      console.log(response);

      if(response==='Login Successful'){
        alert("Login Successfull")
        this.router.navigate(['/home']);
      }else{
        this.incorrect=response;
      }
    },
    (error)=>{
      console.log(error);
      this.incorrect="An error occured during login";
    }
    )

  }

}
