//classes create blueprints
//in angular classes are used for components, services, directives, pipes, and many others

import { Drinkable } from './interfaces';

class CaffeinatedDrink implements Drinkable{

    //fields... public by default
    dosage: number;
    type: string;

    private strength: number;

    constructor(strength: number){
        this.strength = strength || 0;
    }

    //     vvv--method name
    //              vvvv---return type
    public chug(): void{
        console.log("this better keep me awake");
    }

    public getStrength(): number{
        return this.strength;
    }

    public setStrength(strength: number): void{
        this.strength = strength;
    }

    public drink(amount: number): void {
        console.log(`I drank ${amount} of ${this.type}; a ${CaffeinatedDrink.isDrinkable()} drinkable drink`);
    }

    static isDrinkable(): string{
        return `probably`;
    }

}

//Instantiate object
let monster = new CaffeinatedDrink(40);
monster.chug();
monster.dosage = 100;
monster.type = `enegry drink`;

console.log(monster);

console.log(CaffeinatedDrink.isDrinkable());