const input = require("prompt-sync")();

let principal = Number(input("Enter Principal: $"));

let rate = Number(input("Enter rate: "));

let time = Number(input("Enter Time: "));

let freq  = Number(input("Enter Frequency: "));

let si = (principal * rate * time) / 100;

let ciBase = 1 + ((rate / 100) / freq);

let ciIndex =  freq * time;

let ci = (principal * (ciBase ** ciIndex)) - (principal);

console.log(`Simple Interest: ${si.toFixed(2)} \nCompound Interest: ${ci.toFixed(2)}`);
