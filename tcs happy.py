N,K = map(int,input().split())
arr = list(map(int,input().split())) 
count=0	


for i in range(N):
	for j in range(N-1):
		if arr[i]>(arr[j]-K) :
			count+=1
			break
			
			
print(count)	
		
'''
3 2
1 3 5

1 2-1,2-3
3 2-1
5 2-1

'''


'''


6 3
5 5 7 9 15 2

5

3 2
1 3 5

1 2-1,2-3
3 2-1
5 2-1


3


'''
