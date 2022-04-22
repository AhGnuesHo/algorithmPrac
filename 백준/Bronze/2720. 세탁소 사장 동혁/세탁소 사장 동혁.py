t = int(input())

money = {25, 10, 5, 1}

for a in range(t):
    target = int(input())
    for m in money:
        print(int(target/m), end = ' ')
        target = target%m