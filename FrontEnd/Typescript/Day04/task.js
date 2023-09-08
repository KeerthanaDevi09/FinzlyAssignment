"use strict";
//Display class  data using advanced features of typescript
//access a class in another class within a package 
Object.defineProperty(exports, "__esModule", { value: true });
var classfile_1 = require("./classfile");
var obj1 = new classfile_1.Employee(2, "Aruna", 80000, "Developer");
obj1.display();
obj1.taxCalculation();
(0, classfile_1.show)("Keerthan", "Finzly");
console.log(classfile_1.keyValue);
