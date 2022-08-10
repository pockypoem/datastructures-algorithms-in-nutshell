// Big O (n^3) Function

let totalEl = 0;

function cube(n) {
    for(let i = 0; i < n; i++) {
        for(let j = 0; j < n; j++) {
            for(let k = 0; k < n; k++) {
                console.log(i,j,k);
                totalEl += 1;
            }
        }
    }
}

const num = 4
cube(num);
console.log(`Total element are ${totalEl}`);