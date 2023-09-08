//Display class  data using advanced features of typescript
//access a class in another class within a package 

import {Employee,show,keyValue} from './classfile'
let obj1=new Employee(2,"Aruna",80000,"Developer");
obj1.display();
obj1.taxCalculation();

show("Keerthan","Finzly");
console.log(keyValue);