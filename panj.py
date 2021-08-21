n = int(input())
arr = list(map(int,input().split()))
arr.sort()

for i in range(len(arr)):
	if i%2==0:
		print(arr[i], end =" ")


'''

8
3 5 1 5 9 10 2 6

'''
	
