passsword = "Dell3004";
special = [
  "(",
  "!",
  '"',
  "#",
  "$",
  "%",
  "&",
  "'",
  "(",
  ")",
  "*",
  "+",
  ",",
  "-",
  ".",
  "/",
  ":",
  ";",
  "?",
  "@",
  "[",
  "]",
  "^",
  "_",
  "`",
  "{",
  "|",
  "}",
  "~",
  ")",
];
function function_one(pwd) {
  f0 = false;
  f1 = false;
  f2 = false;
  f3 = false;
  if (pwd.length >= 8 && pwd.length <= 12) {
    f0 = true;
  }
  for (i = 0; i < pwd.length; i++) {
    if (
      (pwd[i] >= "a" && pwd[i] <= "z") ||
      (pwd[i] >= "A" && pwd[i] <= "Z") ||
      (pwd[i] >= "0" && pwd[i] <= "9")
    )
      f1 = true;
    if (pwd[i] in special == true) {
      f2 = true;
    }
    if (pwd[i] == pwd[i].toUpperCase()) f3 = true;
    if (f0 === true && f1 === true && f2 === true && f3 === true) return true;
  }
}

function function_two(dividend, divisor) {
  quotient = 0;
  while (dividend > divisor) {
    dividend -= divisor;
    ++quotient;
  }
  return dividend;
}

function function_three(radius, height) {
  let volume = 3.14 * radius ** 2 * height;
  volume = Math.ceil(volume);
  return volume;
}

function function_four(array) {
  let passing = 0;
  let fail = 0;
  let sum = 0;
  array.forEach((element) => {
    if (element >= 50) {
      passing++;
    } else {
      fail++;
    }
    sum += element;
  });
  console.log("Total Pass " + passing);
  console.log("Total Fail " + fail);
  console.log("Class Average = " + Math.ceil(sum / array.length));
}

function function_five(text, pattern) {
  if (text.includes(pattern)) console.log("Pattern Exists");
  else console.log("Pattern Does Not exists");
}

if (function_one(passsword) === true) console.log("Valid Password");
else console.log("Invalid Password");
console.log("Remainder = " + function_two(5, 2));
console.log("Volume of Sphere = ", +function_three(3.7, 5.8));
function_four([34, 67, 45, 89, 67, 98, 23]);
function_five("");
