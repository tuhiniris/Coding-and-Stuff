arr = [64, 34, 25, 12, 22, 11, 90]
n = len(arr) #7
for i in range(n):
	for j in range((n-i)-1):
		if arr[j]>arr[j+1] :
			arr[j],arr[j+1] = arr[j+1],arr[j]
print(arr)
