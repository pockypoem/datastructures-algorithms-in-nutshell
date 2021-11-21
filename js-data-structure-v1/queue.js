//basic dari array
//First In First Out (FIFO)
function createQueue() {
    const queue = []; //[3, 2, 1] 
    return {
        //enqueue
        enqueue: function(value) {
            //add in the last
            queue.unshift(value);
        },
        //dequeue
        dequeue: function() {
            queue.pop();
        },
        //peek
        peek: function() {
            return queue[queue.length - 1];
        },
        //size
        size: function() {
            return queue.length;
        }
    }
}

const q = createQueue();
q.enqueue('Create script for physic course');
q.enqueue('Create code example for Algorithm course');
q.enqueue('Review Data Structure course');
q.enqueue('Vacation');

q.dequeue();
q.dequeue();
q.dequeue();
console.log(q.peek());
