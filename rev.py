arr = [1,2,6,7,8,9]
for i in range(len(arr)-1,-1,-1):
	print(arr[i],end = " ")
	
print("")	
n = len(arr)//2
i = 0
j = -1
while(n>0):
	arr[i],arr[j] = arr[j],arr[i]
	i+=1
	j-=1
	n-=1
print(arr)
