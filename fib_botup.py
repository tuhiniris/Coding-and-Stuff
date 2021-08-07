arr = [64,25,12,22,11]
print(arr)

for i in range(len(arr)):
	print(arr)
	for j in range(len(arr)):
		if i!=j and arr[i]<arr[j]:
			arr[i],arr[j]=arr[j],arr[i]	

print(arr)
