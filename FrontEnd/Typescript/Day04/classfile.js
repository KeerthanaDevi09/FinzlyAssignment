"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.keyValue = exports.show = exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(id, name, salary, role) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.role = role;
    }
    Employee.prototype.display = function () {
        console.log("\n----------------Employee Details---------------\n                Employee Id     :: ".concat(this.id, "\n                Employee name   :: ").concat(this.name, "\n                Employee salary :: ").concat(this.salary, "\n                Emoloyee role   :: ").concat(this.role, "\n        "));
    };
    Employee.prototype.taxCalculation = function () {
        var newSalary = this.salary * 12;
        if (newSalary < 250000) {
            console.log("Tax " + 0);
        }
        else if (newSalary > 250000 && newSalary < 500000) {
            var tax = 0.05 * (newSalary - 250000);
            console.log("Tax " + tax);
        }
        else if (newSalary > 500000 && newSalary < 1000000) {
            var tax = 12500 + (0.20 * (newSalary - 500000));
            console.log("Tax " + tax);
        }
        else if (newSalary > 1000000) {
            var tax = 112500 + (0.30 * (newSalary - 500000));
            console.log("Tax " + tax);
        }
    };
    return Employee;
}());
exports.Employee = Employee;
// let obj=new Employee(1,"Keerthi",50000,"Dev");
// obj.display();
// obj.taxCalculation();
function show(a, b) {
    console.log(a + " " + b);
}
exports.show = show;
exports.keyValue = 972002;
