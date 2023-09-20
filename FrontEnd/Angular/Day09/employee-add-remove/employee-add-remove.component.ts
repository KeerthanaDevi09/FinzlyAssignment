import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee-add-remove',
  templateUrl: './employee-add-remove.component.html',
  styleUrls: ['./employee-add-remove.component.css']
})
export class EmployeeAddRemoveComponent implements OnInit {

  employee:any={};
  employees:any[]=[];
  onAdd(){
    if(this.employee.id && this.employee.name && this.employee.salary){
      this.employees.push({...this.employee});
      this.employee={};
    }
  }

  onRemove(index:number){
    this.employees.splice(index,1);
  }

  constructor() { }

  
  ngOnInit(): void {
  }

}
