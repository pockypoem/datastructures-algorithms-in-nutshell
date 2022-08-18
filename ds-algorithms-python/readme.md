## Data Structure

* Data structures are fundamental concepts of computer science which helps is writing efficient programs in any language
* Python is a high-level, interpreted, interactive, and object-oriented scripting language using which we can study the fundamentals of data structure in a simpler way as compared to other programming languages

## General Data Structure
* Array: It is a sequential arrangement of data elements paired with the index of the data element
* Linked List: Each data element contains a link to another element along with the data present in it.
* Stack: It is a data structure which follows only to specific order of operation. LIFO (last in First Out) or FILO (First in Last Out)
* Queue: It is similar to Stack but the order of operation is only FIFO (First In First Out)
* Matrix: It is two dimensional data structure in which the data element is referred by a pair of indices.

## Non-Linear Data Structure
* Binary Tree: It is a data structure where each data element can be connected to maximum two other data elements and it starts with a root node.
* Heap: It is a special case of Tree data structure where the data in the parent node is either strictly greater than / equal to the child nodes or strictly less than it's child nodes.
* Hash Table: It is a data structure which is made of arrays associated with each other using a hash function. It retrieves values using keys rather than index from a data element.
* Graph: It is an arrangement of vertices and nodes where some of the nodes are connected to each other through links. Graph can be combined with neural networks.

## Specific Data Structure
* List: It is similar to array with the exception that the data elements can be of different data types. You can have both numeric and string data in a python list.
* Tuple: Tuples are similar to lists but they are immutable which means the values in a tuple can't be modified, they can be only be read.
* Dictionary: The dictionary contains Key-value pairs as its data elements.

## Let's Dive in
### Array
* Array is a container which can hold a fix number of items and these items should be of the same type. Most of the data structures make use of arrays to implement their algorithm.
* Element - Each item stored in an array is called an element.
* Index - Each location of an element in an array has a numerical index, which is used to identify the element.

### List
* The list is a most versatile datatype available in Python which can be written as a list of comma-separated values (items) between square brackets. The important thing about a list is that items in a list need not be of the same type.

### Linked List
* A linked list is a sequence of data elements, which are connected together via links. Each data element contains a connection to another data element in form of a pointer. Python doesn't have linked lists in its standard library. We implement the concept of linked lists using the concept of nodes.

### Stack
* In a stack the element inserted last in sequence will come out first as we can remove only from the top of the stack. Such feature is known as Last in First Out (LIFO) feature. The operations of adding and removing the elements is known as PUSH and POP

### Queue
* First In First Out method. An queue can be implemented using python list where we can use the insert() and pop() methods to add and remove elements.