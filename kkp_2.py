N = int(input())
arr = list(map(int,input().split()))
flag = int(input())
temp = 0
while(flag>0):
	temp = arr[0]
	for j in range(N-1):
		arr[j]=arr[j+1]
	arr[N-1]=temp	
	flag-=1
	
print(*arr)
