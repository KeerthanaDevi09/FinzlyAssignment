import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  employeeName:string|null='';
  constructor(private router:Router) { }

  ngOnInit(): void {
    this.employeeName=sessionStorage.getItem("employeeName");
    console.log(this.employeeName);
  }

  onLogout(){
      sessionStorage.removeItem("employeeName");
      sessionStorage.clear();
      this.router.navigate(['/employee-login']);
  }
  

}
