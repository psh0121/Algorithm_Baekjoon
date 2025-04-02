let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim();
let star1 = [];
let star2 = [];
let result = [];

for (let i = 1; i <= Number(input); i++) {
	if (i % 2 === 1) star1.push("*", " ");
	else star2.push(" ", "*");
}

star1 = star1.join("").trimRight();
star2 = star2.join("").trimRight();

for (let j = 1; j <= Number(input) * 2; j++) {
	if (j % 2 === 1) result.push(star1);
	else if (j % 2 === 0) result.push(star2);
}

console.log(result.join("\n"));