//child class that extends class1

import { Fruits } from "./class1";

export class Mango extends Fruits{
    taste:string;
    str:string;

    constructor(t:string){
        super();
        this.taste=t;
    }

    override myTaste(): void {
        this.str="My taste is " + this.taste;
    }

    show(){
        console.log(this.str);
    }
}

//access within same class file

// let mobj=new Mango("Sweet");
// mobj.myTaste();
// mobj.show();