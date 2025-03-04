def find(key, List):

    '''
    #inorder to see values we can use below traversal loop. but not prefered when accessing index of respective value is required.

    for i in List:  # Loop starts
        if i == key:
            print("Key",key, "found at Index ",i," the given list.")
            return  # Inside the loop, exits if found
    
    msg = print("Key ",key," not found in the give list")  # Should execute only once
    '''
    
    index = 0

    for index,value in enumerate(List):
        if key == value:
            print("Key ",key," found at index ",index," at given list.") 
            return

    msg  = print("key ",key," Not found in given List.")

    return msg


A = [2,4,6,8,10];
key = 6

print("Printing given elements in the list.")
j = 0;

for j in A:
    print(j)


find(key,A)
