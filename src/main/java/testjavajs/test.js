"use strict"
// console.log(typeof null);
// let arr = [1, 1, 1];
// const r = () => {
//     return "op"
// }
//
// function arrd(a) {
//     console.log(a ?? "m")
// }
//
//
// arrd();
let user = {
    name: undefined, age: 123, po: true, 7: 90,
};
// let s = Symbol("oo");
// user[s] = 111;
//
// for (let key in user) {
//     console.log(key);
// }
let arr = [10, 1, 2, 2]
let countries = ['Osterreich', 'Andorra', 'Vietnam', "Russia"];
// arr.push(1111111111)
// arr.pop()
// arr.shift()
// arr.unshift("ppp")
// for (const arrElement of arr) {
//     console.log(arrElement)
// }
//console.log(countries.sort((a, b) => b.localeCompare(a)).join(""));
let r = "russia";
// console.log(countries.reduce((sum, curr) => sum.concat(curr)));
// console.log(Array.from("string").shift());
let map = new Map();
let set = new Set();
set.add(1).add(2).add(3).add(1)
map.set(1, 2).set("1", 2).set(2, 2);
user.map = map;
console.log(Array.from(user))
let pa = {0: "dd", 1: "sd", 2: 56};
pa.length = 3;
for (let [key, value] of map) {
    //console.log(key + " " + value)
}
let {
    name: nnn = () => {
        return 100
    }, age = function () {
        return "ss"
    }, po
}
    = user;
let date = new Date("2019-11-03");
user.date = date;
user.l = "qqq"
user.toJSON = function () {
    return this.date
}
let arrr = [123, 324, 685, 4546, 657567, 243, 1235, 6, 876, 543];
let nonuser = {i: 78, 5: "fgg"};
let bb = {...user, ...nonuser}
console.log(bb);






