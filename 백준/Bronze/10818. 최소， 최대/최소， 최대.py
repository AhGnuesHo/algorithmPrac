a = int(input())
arr = list(map(int,input().split()))

arr.sort()
print(arr[0], end = ' ')
print(arr[a-1])