//child class that extends child class car

import { Vehicle } from "./baseclass";

export class BMW extends Vehicle{
    brand:string;

    myFunctionality(): void {
        this.brand="Car brand is BMW";
    }

    display()
    {
        console.log(this.brand);
    }
}

//obje of sub class2 

// let obj=new BMW();
// obj.myFunctionality();
// obj.display();