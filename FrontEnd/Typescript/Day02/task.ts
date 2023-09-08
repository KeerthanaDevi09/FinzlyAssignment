//Anonymous functionlet t2=function (k1:number,k2:number){

//function with parameters and without return type.

let t2=function (k1:number,k2:number){
    console.log("value of 2nd method is "+(k1+k2));
}
t2(13,10);

//function without parameters and with return type.


let t3=function ():string{
    return "keerthi";
}
let res1=t3();
console.log("value of 3rd method is "+res1);





//Fat arrow function/Arrow function

//function with parameters and without return type.

let p2= (k1:number,k2:number)=>{
    console.log("value of 2nd method is "+(k1*k2));
}
p2(13,10);


//function without parameters and with return type.


let p3= ():string=>{
    return "hello";
}
let res2=p3;
console.log("value of 3rd method is "+ res2);
