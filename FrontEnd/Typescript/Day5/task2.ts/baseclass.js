"use strict";
//Multi level inheritance
Object.defineProperty(exports, "__esModule", { value: true });
exports.Vehicle = void 0;
var Vehicle = /** @class */ (function () {
    function Vehicle() {
    }
    Vehicle.prototype.myFunctionality = function () {
        console.log("Base class method");
    };
    return Vehicle;
}());
exports.Vehicle = Vehicle;
