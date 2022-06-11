arr = []
max, a, b = 0, 0,0 
 

for _ in range(9):
    i = int(input())
    arr.append(i)
    max += i


for i in range(0, len(arr)) :
    for j in range(i+1, len(arr)) : 
       if max - arr[i] - arr[j] == 100 :
            a = arr[i]
            b = arr[j]
            break

arr.remove(a)
arr.remove(b)
arr.sort()

for i in arr :
    print (i)
        
           



