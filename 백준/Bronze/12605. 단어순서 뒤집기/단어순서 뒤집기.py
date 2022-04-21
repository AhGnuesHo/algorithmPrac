n = int (input())

n_list = [input() for _ in range(n)]
num = 1
for a in n_list :
    word_list = a.split()
    str = " ".join(word_list[::-1])
    print(f"Case #{num}: {str}")
    num += 1