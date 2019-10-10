/*
* Let's do some JavaScript
*/

alert("Hello");

var a, b, c, d, e, f, g, h, i;

b = '10';

c = true;

d = { myValue: "stuff"};

for (val in d) {
    console.log(val);
}

console.log(d.hasOwnProperty('myValue'));

console.log(Object.keys(d));

e = null;

//f = -> undefined value

g = (0/0);

h = [];

h[3] = {myArr: [h]};

function i() {};

i = function() {};

i = () => {};

/*Types in JS
    - number (64 bit floating point)
    - string
    - boolean
    - objects
    - null (object type)
    - NaN (number type.. not a number is a number)
    - undefined - when a var is never initialized
    - Infinity (number type),l
*/

var robotParts = {

    make: `acme`,
    pieces: [
        {
            type: `transistor`,
            size: `2nm`
        },
        {
            type:  `processor`,
            size: `1in`
        }
    ],
    weapon: `phazon lazzerrrrrr`

}

//Maker function
function makeRobotParts(make, pieces, weapon) {
    var robotParts = {};
    robotParts.make = make;
    robotParts.pieces = pieces;
    robotParts.weapon = weapon;
    robotParts.walk = function() {console.log(`my ${make} robot is walking with its ${pieces[0].type} parts`)};
    return robotParts;
}

var myNewRobotparts = makeRobotParts('space X', [{type: 'anti-human tech'}], 'human desinigrator');

myNewRobotparts.walk();

//making a class using function syntax
var Robot = function(parts, protocols, name, creator) {
    this.parts = parts;
    this.protocols = protocols;
    this.name = name;
    this.creator = creator
};

Robot.prototype.walkThroughWalls = function(){
    console.log(`KABOOM!!!! I am ${this.name} and I am here to ${this.protocols[0]}`)
};


var myRobot = new Robot(
    makeRobotParts('Ford', [{type: 'thingy'}], 'blaster cannon'), 
    ['perserve human life', 'chew gum', 'kick butt', 'program stuff'], 
    'robby', 
    'JavaScript');

var BipedalCleaningRobot = function(){};
BipedalCleaningRobot.prototype = new Robot();
BipedalCleaningRobot.prototype.clean = function(){console.log("I am sweeping with a broom and walking on two legs")};


