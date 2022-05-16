h, m = map(int, input().split())

# 시간이 바꿔어야하면
if (m < 45):
    m = 60 - (45 - m)
    if (h == 0):
        h = 23
    else:
        h -= 1
else:
    m = m - 45
    

print(h, end = ' ')
print(m)