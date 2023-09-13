"use strict";
//child class that extends shape class
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
exports.Rectangle = void 0;
var demo1_1 = require("./demo1");
var Rectangle = /** @class */ (function (_super) {
    __extends(Rectangle, _super);
    function Rectangle(l, b) {
        var _this = _super.call(this) || this;
        _this.length = l;
        _this.breath = b;
        return _this;
    }
    Rectangle.prototype.myArea = function () {
        this.area = this.length * this.breath;
    };
    Rectangle.prototype.display = function () {
        console.log("\n            -------------Rectangle class-----------\n            Rectangle length   :: ".concat(this.length, "\n            Rectangle Breath   :: ").concat(this.breath, "\n            Rectangle Area     :: ").concat(this.area, "   \n        "));
    };
    return Rectangle;
}(demo1_1.Shape));
exports.Rectangle = Rectangle;
// let robj=new Rectangle(5,7);
// robj.myArea();
// robj.display();