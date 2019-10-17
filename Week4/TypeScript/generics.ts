import { Drinkable } from "./interfaces";

let numArray: Array<number>;

numArray = [1,2,3,5,3,1,4,5];

//numArray = ['are not numbers', 'definitly not a number'];

function identity<T>(arg: T): T{
    return arg;
}

interface GenericInterface<T>{
    stuff: T;
    (arg: T): T;
}

class GenericClass<T>{
    stuff: T;
    stuff2: T;
}

class ImplementedClass <MyDrinkable extends Drinkable>{
    
}


