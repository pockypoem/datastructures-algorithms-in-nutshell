// Big O (n^2) Function

function square(n) {
    for(let i = 0; i < n; i++) {
        for(let j = 0; j < n; j++) {
            console.log(i,j);
        }
    }
}

const num = 5;
square(num);