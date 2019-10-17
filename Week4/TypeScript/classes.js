//classes create blueprints
//in angular classes are used for components, services, directives, pipes, and many others
class CaffeinatedDrink {
    constructor(strength) {
        this.strength = strength || 0;
    }
    //     vvv--method name
    //              vvvv---return type
    chug() {
        console.log("this better keep me awake");
    }
    getStrength() {
        return this.strength;
    }
    setStrength(strength) {
        this.strength = strength;
    }
    static isDrinkable() {
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
