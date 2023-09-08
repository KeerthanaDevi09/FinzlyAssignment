//access a class in another class in outer  package 

import {Employee,show,keyValue} from '../Day4/classfile'
let obj1=new Employee(3,"Sreeja",60000,"HR");
obj1.display();
obj1.taxCalculation();

show("Aruna","Rams");
console.log(keyValue);