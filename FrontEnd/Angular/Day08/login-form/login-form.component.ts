import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  // username: string = '';
  // password: string = '';
  // showErrorMessgae:boolean=false;
  onSubmit(user:any,pass:any)
  {
    if (user === 'Keerthi' && pass === 'Keerthi@12345') {
      alert('Login successful!');
    }
    else if(user=='' || pass==''){
      alert('Please enter username and password!');
    }
    else{
      alert('Login fail. Please enter valid username and password!');
    }
  }

  onKeyUpUser(user:any)
  {
    if(user.value.length > 10){
      alert("Please enter less than 10 the charachter")
    }
  }
  onKeyUpPass(pass:any)
  {
    if(pass.value.length > 15){
      alert("Please enter less than 15 the charachter")
    }
  }

}
