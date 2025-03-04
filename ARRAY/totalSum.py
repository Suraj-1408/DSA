def totalSum(A):
    i = 0
    sum = 0

    for i in A:
        sum = sum + i 

    return sum;

A = [2,4,6,8,10];
print("Elements of list are:")
i = 0

for i in A:
    print(i)

res = totalSum(A);
print("Total SUm is:",res);
