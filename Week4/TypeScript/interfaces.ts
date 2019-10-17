//Interfaces are contracts for other classes and objects
//can be used to define custom types without creating classes
// are not translated into JS

interface User {
    username: string;
    password: string;
    confirmPassword?: string; // optional field
    chug: (thing: string, thing2) => void;
}

let user: User;

user = {username: 'bob', password: 'bob1', chug: (x, y)=>{console.log(x + " " + y)}}; //valid instantiation of a user
user = {username: 'bobbert', password: 'bob2', confirmPassword: 'bob2', chug: (x, y)=>{console.log(x + " " + y)}};

export interface Drinkable {
    drink(amount: number):void;
}

