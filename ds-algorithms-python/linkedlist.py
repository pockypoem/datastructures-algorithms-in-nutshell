class Node:
    def __init__(self, dataval = None):
        self.dataval = dataval
        self.nextval = None

class SLinkedList:
    def __init__(self):
        self.headval = None
    
    def listprint(self):
        printval = self.headval
        while printval is not None:
            print(printval.dataval)
            printval = printval.nextval

lists = SLinkedList()
lists.headval = Node("Mon")
e2 = Node("Tue")
e3 = Node("Wed")

lists.headval.nextval = e2
e2.nextval = e3

lists.listprint()