n = int(input())
arr = map(int,input().split())
ansarr = []
nonansarr = []
for i in range(n):
	if arr[i]%10==0:
		ansarr.append(arr[i])
	else:
		nonansarr.append(arr[i])
print(*(nonansarr+ansarr))			
