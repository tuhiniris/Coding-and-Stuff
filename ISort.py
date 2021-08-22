arr = [64,34,25,12,22,11,90,1,2,3,4,5,6,7,11,13]
n = len(arr)

for i in range(n):
	temp = arr[i]   
	j = i      
	while(j>0 and temp<arr[j-1]):
		arr[j] = arr[j-1]  
		j = j-1           
	arr[j] = temp;

print(arr)
