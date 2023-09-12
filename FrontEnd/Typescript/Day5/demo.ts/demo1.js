"use strict";
//Inheritance 
//Single, Multi level, Hiarachical
Object.defineProperty(exports, "__esModule", { value: true });
exports.Shape = void 0;
//Hiararchical inheritance
var Shape = /** @class */ (function () {
    function Shape() {
    }
    Shape.prototype.myArea = function () {
        console.log("Base class method");
    };
    return Shape;
}());
exports.Shape = Shape;
