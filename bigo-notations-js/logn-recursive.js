// Big O (log n) Recursive Function

let res = 0;
function logFunc(n) {
    if (n === 1) return "Done";
    n = Math.floor(n / 2);
    res += 1;
    return logFunc(n);
}

const num = 8;
console.log(logFunc(num));
console.log(`Log ${num} is ${res}`);