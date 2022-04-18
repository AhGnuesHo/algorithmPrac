# 대문자로 변경
n = input().upper()
# 중복되는 문자 제거
n_list = list(set(n))

# n(입력받은 문자)에서 n_list의 값이 몇번 나왔는지 검사
count_list = []
for a in n_list:
  count = n.count(a)
  count_list.append(count)

# 리스트에서 가장 큰 값의 개수
if count_list.count(max(count_list)) >= 2 :
  print("?")
else :
  # 가장 큰 값이 있는 인덱스 찾기
  index = count_list.index(max(count_list))
  print(n_list[index])
