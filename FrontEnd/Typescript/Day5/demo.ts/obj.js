"use strict";
//Object of both child classes
Object.defineProperty(exports, "__esModule", { value: true });
var circle_1 = require("./circle");
var rectangle_1 = require("./rectangle");
var cobj = new circle_1.Circle(3);
cobj.myArea();
cobj.display();
var robj = new rectangle_1.Rectangle(7, 9);
robj.myArea();
robj.display();
