"use strict";
//child class that extends class1
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
exports.Mango = void 0;
var class1_1 = require("./class1");
var Mango = /** @class */ (function (_super) {
    __extends(Mango, _super);
    function Mango(t) {
        var _this = _super.call(this) || this;
        _this.taste = t;
        return _this;
    }
    Mango.prototype.myTaste = function () {
        this.str = "My taste is " + this.taste;
    };
    Mango.prototype.show = function () {
        console.log(this.str);
    };
    return Mango;
}(class1_1.Fruits));
exports.Mango = Mango;
//access within same class file
// let mobj=new Mango("Sweet");
// mobj.myTaste();
// mobj.show();
