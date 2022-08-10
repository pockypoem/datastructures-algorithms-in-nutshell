// Big O (n) Function
function linearFunc(arr) {
    for(let i = 0; i < arr.length; i++) {
        console.log(1000 * 100000);
    }
}

function linearFunc2(arr) {
    for(let i = 0; i < arr.length; i++) {               // O(n)
        console.log(1000 * 100000);                     // O(1)
        let something = (200000000 * 100000) / 2;       // O(1)
        console.log(something);                         // O(1)
    }
}

// Big O Notation for linearFunc() is O(n)
// Big O Notation for linearFunc2() is O(n) 

const arr = [1,2,3,4,5,6,7]
linearFunc2(arr);