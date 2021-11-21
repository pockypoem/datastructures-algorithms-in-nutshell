//Array dengan setiap item didalamnya saling terhubung
//Lebih baik dari array karena tidak perlu membooking tempat di memory yang bersebelahan
//bisa di posisi random. Namun kita memberikan info agar masing masing alamat pada address memory
//dapat saling terhubung

function createNode(value) {
    return {
        //value: value,
        value,
        //next
        next: null
    }
}

function createLinkedList() {
    return {
        //(3 properties)
        head: null,
        tail: null,
        length: 0,

        //(5 methods)
        push: function(value) {
            const node = createNode(value);

            //if linkedlist is empty
            if(this.head == null) {
                this.head = node;
                this.tail = node;
                this.length += 1;
                return node;
            } else {
                this.tail.next = node;
                this.tail = node;
                this.length += 1;
                return node;
            }
        },
        pop: function() {
            //empty
            if (this.isEmpty())  {
                return null; //tidak ada yang di pop
            }
            const node = this.tail; //check node yang ada di paling akhir 
            //1 node
            if (this.head == this.tail) {
                this.head = null;
                this.tail = null;
                this.length = 0;
                return node;
            }
            //more than 1 node
            //tampung head sebagai current
            let current = this.head;
            let penult; //1 posisi sebelum terakhir
            while(current) {
                if(current.next == this.tail) {
                    penult = current;
                    break;
                }               
                current = current.next;
            }
            penult.next = null; //karena akan dihapus
            this.tail = penult;
            this.length -= 1;

            return node;
        },
        get: function(index) {
            //list kosong
            if(index < 0 || index > this.length) {
                return null;
            }
            //list item 1
            if(index == 0) {
                return this.head;
            }
            //list item lebih dari 1
            let current = this.head;
            let i = 0;
            while(i < index) {
                current = current.next;
                i += 1;
            }
            return current;
        },
        delete: function(index) {
            //list kosong
            if (index <0 || index > this.length) {
                return null;
            }
            //list item 1
            if (index == 0) {
                const deleted = this.head;
                this.head = this.head.next;
                this.length -= 1;
                return deleted;
            }
            //list item > 1
            let current = this.head;
            let prev; //untuk menampung node sebelumnya
            let i = 0;
            while (i < index) {
                prev = current;

                current = current.next;
                i += 1;
            }
            const deleted = current;
            prev.next = current.next;
            this.length -= 1;
            return deleted;
        },
        isEmpty: function() {
            return this.length == 0;
        },
        print: function() {
            const values = [];
            let current = this.head;
    
            while(current) {
                values.push(current.value);
                current = current.next;
            }
            return values.join(' => ');
        }
    }
}

const list = createLinkedList();
const values = ['a', 'b', 'c', 'd'];
const nodes = values.map(function(val) {
    list.push(val);
});

list.pop();
// console.log(list.tail.value);
// console.log(list.get(1));
console.log(list.delete(1));
console.log(list.print());