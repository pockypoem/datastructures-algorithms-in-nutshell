// Big O (log n) Iterative / Non-Recursive Function

function logn(n) {
    let res = 0;
    while(n > 1) {
        n = Math.floor(n/2);
        res += 1;
    }
    return res;
}

const num = 8;
console.log(`Log ${num} is ${logn(num)}`);