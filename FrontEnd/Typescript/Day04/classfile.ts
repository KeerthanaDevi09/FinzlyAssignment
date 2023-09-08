export class Employee{
    public id:number;
    public name:string;
    public salary:number;
    public role:string;

    constructor(id:number,name:string,salary:number,role:string){
            this.id=id;
            this.name=name;
            this.salary=salary;
            this.role=role;
    }

    public display()
    {
        console.log(`
----------------Employee Details---------------
                Employee Id     :: ${this.id}
                Employee name   :: ${this.name}
                Employee salary :: ${this.salary}
                Emoloyee role   :: ${this.role}
        `);
    }

    public taxCalculation()
    {
        let newSalary=this.salary*12;

        if(newSalary <  250000)
        { 
            console.log("Tax "+0);
        }
        else if(newSalary >250000 && newSalary < 500000)
        {
            let tax=0.05 * (newSalary-250000);
            console.log("Tax "+tax);
        }
        else if(newSalary >500000 && newSalary < 1000000)
        {
            let tax=12500 + (0.20 * (newSalary-500000));
            console.log("Tax "+tax);
        }
        else if(newSalary >1000000)
        {
            let tax=112500 + (0.30 * (newSalary-500000));
            console.log("Tax "+tax);
        }
    }
}

// let obj=new Employee(1,"Keerthi",50000,"Dev");
// obj.display();
// obj.taxCalculation();

export function show(a:string,b:string)
{
    console.log(a+" "+b);
}

export const keyValue=972002;

