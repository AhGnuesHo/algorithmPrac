max = 0
num = 0
for i in range(9):
    target =  int(input())
    if max < target:
        max = target
        num = i+1

print(max)    
print(num)