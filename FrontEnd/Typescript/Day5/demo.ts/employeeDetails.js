"use strict";
//implements the interface
//implement the department class 
//employeeDetails class depends on department class
Object.defineProperty(exports, "__esModule", { value: true });
exports.EmployeeDetails = void 0;
var department_1 = require("./department");
var EmployeeDetails = /** @class */ (function () {
    function EmployeeDetails(id, fn, ln, sal, role) {
        this.eid = id;
        this.fname = fn;
        this.lname = ln;
        this.salary = sal;
        this.dept = new department_1.Department(role);
    }
    EmployeeDetails.prototype.displayDetails = function () {
        console.log("\n            -----------------Employee Details--------------\n            Employee id         :: ".concat(this.eid, "\n            Employee First name :: ").concat(this.fname, "\n            Employee Last name  :: ").concat(this.lname, "\n            Employee Salary     :: ").concat(this.salary, "\n            Employee Role       :: ").concat(this.dept.getRole(), "\n        "));
    };
    return EmployeeDetails;
}());
exports.EmployeeDetails = EmployeeDetails;
// let eobj=new EmployeeDetails(100,"Keerthi","E",15000,"Developer");
// eobj.displayDetails();
