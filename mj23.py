n = int(input())
arr = []
for i in range(n):
	arr.append(int(input()))
arr_multiply = []
arr_not_multiply = []
for element in arr:
	if element%10 ==0:
		arr_multiply.append(element)
	else:
		arr_not_multiply.append(element)

print(*arr_not_multiply,end=" ")
print(*arr_multiply)			
