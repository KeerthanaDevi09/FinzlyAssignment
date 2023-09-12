//child class that extends shape class

import {Shape} from './demo1'

export class Rectangle extends Shape{
    length:number;
    breath:number;
    area:number
    constructor(l:number,b:number)
    {
        super();
        this.length=l;
        this.breath=b;
    }

    override myArea(): void {
        this.area=this.length*this.breath;
    }

    display(){
        console.log(`
            -------------Rectangle class-----------
            Rectangle length   :: ${this.length}
            Rectangle Breath   :: ${this.breath}
            Rectangle Area     :: ${this.area}   
        `);
    }
}

// let robj=new Rectangle(5,7);
// robj.myArea();
// robj.display();