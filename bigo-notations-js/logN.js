// Coding Binary Search
let arr = [];
let start = 0;
let target = 100000;

// Updating existing array
for (let i = 1; i <= 1024; i++) {
    arr.push(i);
}

let end = arr.length - 1;

// console.log(arr);

// Recursive Function
// floor: returns the natural logarithm (base e) of a number.
function binarySearch(arr, start, end, target) {
    console.log(arr.slice(start, end));
    if (start > end) return false;
    let midIndex = Math.floor((start + end) / 2);
    if (arr[midIndex] === target) return true; //exist within the array
    
    if (arr[midIndex] > target) return binarySearch(arr, start, midIndex - 1, target)
    else return binarySearch(arr, midIndex + 1, end, target)
}

binarySearch(arr, start, end, target);

// RangeError: Maximum call stack size exceeded
// It means that somewhere in your code, you are calling a function which in turn calls another function and so forth, until you hit the call stack limit.