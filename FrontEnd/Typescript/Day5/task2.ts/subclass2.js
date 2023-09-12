"use strict";
//child class that extends child class car
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
Object.defineProperty(exports, "__esModule", { value: true });
exports.BMW = void 0;
var baseclass_1 = require("./baseclass");
var BMW = /** @class */ (function (_super) {
    __extends(BMW, _super);
    function BMW() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    BMW.prototype.myFunctionality = function () {
        this.brand = "Car brand is BMW";
    };
    BMW.prototype.display = function () {
        console.log(this.brand);
    };
    return BMW;
}(baseclass_1.Vehicle));
exports.BMW = BMW;
//obje of sub class2 
// let obj=new BMW();
// obj.myFunctionality();
// obj.display();
