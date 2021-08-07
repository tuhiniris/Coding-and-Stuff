def checkmult(n):
	if n%10==0:
		return True
	else:
		return False	

N = int(input())
arr = list(map(int,input().split()))


for i in range(len(arr)):
	if checkmult(arr[i]):
		arr.append(arr.pop(arr.index(arr[i])))
print(*arr)		

