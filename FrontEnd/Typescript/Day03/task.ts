//create a srting array and add the data dynamicaly and retrive the data

let k:string[]=[];
k.push("keerthi");
k.push("aruna","priya");
k.splice(2,0,"preethi","sree");
k.splice(4,0,"nandhini");

console.log(k.join(" - "));

for(let i=0;i<k.length;i++)
{
    console.log("Name in the inde "+i+" is "+k[i]);
}


