"use strict";
//Aggregation - has a relationship
Object.defineProperty(exports, "__esModule", { value: true });
exports.Department = void 0;
var Department = /** @class */ (function () {
    function Department(role) {
        this.role = role;
    }
    //getters and setters
    Department.prototype.getRole = function () {
        return this.role;
    };
    Department.prototype.setRole = function (role) {
        this.role = role;
    };
    return Department;
}());
exports.Department = Department;
