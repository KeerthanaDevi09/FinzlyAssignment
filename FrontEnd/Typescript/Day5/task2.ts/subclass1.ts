//child class that extends base class

import { Vehicle } from "./baseclass";

export class Car extends Vehicle{
    type:string;
    constructor()
    {
        super();
    }

    override myFunctionality(): void {
        this.type="Vehicle type car";
    }

    display()
    {
        console.log(this.type);
    }
}

