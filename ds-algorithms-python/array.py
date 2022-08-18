from array import *

array1 = array('i', [10,20,30,40,50])

# Accessing
print(array1[0])
print(array1[2])

print("")

# Inserting
array1.insert(1, 60)

for x in array1:
    print(x)

print("")

# Deleting
array1.remove(40)

for x in array1:
    print(x)

print("")

# Searching
print(array1.index(30))

print("")

# Updating
array1[2] = 80

for x in array1:
    print(x)