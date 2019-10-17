"use strict";
//Interfaces are contracts for other classes and objects
//can be used to define custom types without creating classes
exports.__esModule = true;
var user;
user = { username: 'bob', password: 'bob1', chug: function (x, y) { console.log(x + " " + y); } }; //valid instantiation of a user
user = { username: 'bobbert', password: 'bob2', confirmPassword: 'bob2', chug: function (x, y) { console.log(x + " " + y); } };
