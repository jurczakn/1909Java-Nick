//Pre-ES6
//Immediatly Evoked Function Expression
//allows JS developers to create a local scope

var temp = 28;

var displayTemp;

(function iefe(){

    var farenheightString = "F";

    var celciusString = "C";

    var offset = 32;

    var rate = 1.8;

    var ferenheightTemp = (temp * rate) + offset;

    displayTemp = `${temp}*${celciusString} : ${ferenheightTemp}*${farenheightString}`;

})()

console.log(displayTemp);

//Closure: a way to achieve Encapsulation in JS
//by returning a function from within a function that
//holds the value being encapsulated

var x = function(){
    var value = 12;

  /*return function(){
        return value;

    } */

    return {
        getValue: function() {return value;},
        setValue: function(val){value = val;}
    }

}()

//Overloading

/* function add(x, y, z) {
    return x + y + z;
} */

var add = function(x, y, z) {
    return x + y + z;
}

/* function add(x, y) {
    return x + y;
} */

add = function(x, y) {
    return x + y;
}

add = function(x, y, z) {
    if (z === undefined) {
        return x + y 
    } else {
        return x + y + z
    }
}

add = function() {
    var ret = 0
    for(i of arguments){
        ret += i;
    }
    return //<-------- Semi-Colon Injection
    ret;
}
//template literals allow you to reference variables using the ${} notation
//as well as define multi-line stings
let myLongString = `This is a very
long string and will actually take up
multiple lines`;

//as of ES6, JavaScript introduced class syntax
//all of this is simply syntax sugar
class Burrito{

    constructor(contents, size, toasted, price){
        this.contents = contents;
        this.size = size;
        this.toasted = toasted;
        this.price = price;
    }

    eat(){
        console.log(`I really like this ${this.size} burrito 
        that ${this.toasted?'is':'is not'} toasted 
        with it's ${this.contents}`);
    }

    buy() {
        console.log(`I payed ${this.price} for my burrito, it better be worth it`);
    }

}

class Chimichanga extends Burrito{
    
    constructor(contents, size, price, oil){
        super(contents, size, true, price);
        this.oil = oil;
    }

    eat() {
        super.eat();
        console.log("Oh yeah, also it is fried");
    }
    
    fry() {
        console.log(`I fry this burrito`);
    }
}
