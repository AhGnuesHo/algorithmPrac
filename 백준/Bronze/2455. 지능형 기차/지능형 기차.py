in_train = 0
max = 0
for a in range(4): 
    out, join = map (int, (input().split()))
    in_train += join-out
    if (in_train > max) :
        max = in_train

print(max)