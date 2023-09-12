"use strict";
//Single inheritance
Object.defineProperty(exports, "__esModule", { value: true });
exports.Fruits = void 0;
var Fruits = /** @class */ (function () {
    function Fruits() {
    }
    Fruits.prototype.myTaste = function () {
        console.log("Super class method");
    };
    return Fruits;
}());
exports.Fruits = Fruits;
