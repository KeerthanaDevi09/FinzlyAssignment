//child class that extends shape class

import {Shape} from './demo1'
export class Circle extends Shape{
    radius:number;
    area:number;
    constructor(radius:number){
        super();
        this.radius=radius;
    }

    override myArea(): void {
        this.area=3.14*this.radius*this.radius;
    }

    display()
    {
        console.log(`
            -----------Circle Class---------
            Circle radius  :: ${this.radius}
            Circle Area    :: ${this.area}
        `)
    }
}

// let cobj=new Circle(3);
// cobj.myArea();
// cobj.display();