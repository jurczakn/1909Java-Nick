//Typescript - well - strong typing allows us to define types of our variables

let myString: string;

myString = `this is a string`;

//trying to assign a number to a string - myString, causes Error
myString = 4;

//TypeScript can also infer types
let anotherString = `this is a string without :string`;

anotherString = 7;

//if you do not initialize or specify a type, it is of type any
let yetAnotherString;

yetAnotherString = `this is a string`;

(<string>yetAnotherString)

yetAnotherString = 13;



//Other basic types

let aString: string;
let aNumber: number;
let aBoolean: boolean;
let anArray: Array<string>;
let anything: any;
//do not use, bad practice
let not: void;
let notAlso: undefined;
let notAgain: never;
let notForever: null;

not = undefined;
notForever = null;

notAgain = `this is definitly something`;
