#arr = [64,34,25,12,22,11,90,1,2,3,4,5,6,7,11,13]
n = len(arr)

for i in range(n-1):
	for j in range((n-i)-1):
		if arr[j]>arr[j+1] :
			arr[j],arr[j+1] = arr[j+1],arr[j]
print(arr)
