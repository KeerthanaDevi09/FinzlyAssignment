//Aggregation - has a relationship

export class Department{

    private role:string; //private is for encapsulation

    constructor(role:string){
        this.role=role;
    }

    //getters and setters
    getRole()
    {
        return this.role;
    }

    setRole(role:string){
        this.role=role;
    }
}