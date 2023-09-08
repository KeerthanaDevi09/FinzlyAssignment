"use strict";
//access a class in another class in outer  package 
Object.defineProperty(exports, "__esModule", { value: true });
var classfile_1 = require("../Day4/classfile");
var obj1 = new classfile_1.Employee(3, "Sreeja", 60000, "HR");
obj1.display();
obj1.taxCalculation();
(0, classfile_1.show)("Keerthana", "Finzly");
console.log(classfile_1.keyValue);
