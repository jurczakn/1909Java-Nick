//Typescript - well - strong typing allows us to define types of our variables
var myString;
myString = "this is a string";
//trying to assign a number to a string - myString, causes Error
myString = 4;
//TypeScript can also infer types
var anotherString = "this is a string without :string";
anotherString = 7;
//if you do not initialize or specify a type, it is of type any
var yetAnotherString;
yetAnotherString = "this is a string";
yetAnotherString;
yetAnotherString = 13;
//Other basic types
var aString;
var aNumber;
var aBoolean;
var anArray;
var anything;
//do not use, bad practice
var not;
var notAlso;
var notAgain;
var notForever;
not = undefined;
notForever = null;
notAgain = "this is definitly something";
