//implements the interface
//implement the department class 
//employeeDetails class depends on department class

import { Employee } from "./demo2";
import { Department } from "./department";

export class EmployeeDetails implements Employee{
    eid:number;
    fname:string;
    lname:string;
    salary:number;
    dept:Department

    constructor(id:number,fn:string,ln:string,sal:number,role:string)
    {
        this.eid=id;
        this.fname=fn;
        this.lname=ln;
        this.salary=sal;
        this.dept=new Department(role);
    }

    displayDetails()
    {
        console.log(`
            -----------------Employee Details--------------
            Employee id         :: ${this.eid}
            Employee First name :: ${this.fname}
            Employee Last name  :: ${this.lname}
            Employee Salary     :: ${this.salary}
            Employee Role       :: ${this.dept.getRole()}
        `);
    }
}

// let eobj=new EmployeeDetails(100,"Keerthi","E",15000,"Developer");
// eobj.displayDetails();
