//Last In First Out (LIFO)
function createStack() {
    //strukdat array
    let array = [];
    return {
        //push
        push: function(item) {
            array.push(item);
        },
        //pop
        pop: function() {
            array.pop();
        },
        //peek (u/ melihat isi dari stack yang paling atas)
        peek: function() {
            return array[array.length - 1];
        },
        //size
        size: function() {
            return array.length;
        }
    }
}

const bookStack = createStack(); //inisiasi stack baru
bookStack.push("The Effective Engineer");
bookStack.push("The Pragmatic Programmer");
bookStack.push("Start With Why");

console.log(bookStack.peek()); //buku paling akhir

bookStack.pop();
bookStack.pop();
console.log(bookStack.peek());
console.log(bookStack.size());