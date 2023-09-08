//Anonymous functionlet t2=function (k1:number,k2:number){
//function with parameters and without return type.
var t2 = function (k1, k2) {
    console.log("value of 2nd method is " + (k1 + k2));
};
t2(13, 10);
//function without parameters and with return type.
var t3 = function () {
    return "keerthi";
};
var res1 = t3();
console.log("value of 3rd method is " + res1);
//Fat arrow function/Arrow function
//function with parameters and without return type.
var p2 =(k1, k2)=>{
    console.log("value of 2nd method is " + (k1 * k2));
};
p2(13, 10);
//function without parameters and with return type.
var p3 =  ():string=>{
    return "hello";
};
var res2 = p3;
console.log("value of 3rd method is " + res2);
