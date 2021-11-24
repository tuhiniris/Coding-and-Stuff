def binarySearch(list,item):
	min = 0
	max = len(list)-1
	pivot = 0
	while(min<=max):
		pivot = (min+max)//2
		print(list[pivot])
		if(list[pivot])==item:
			return pivot
		else:
			if(list[pivot])<item:
				min = pivot + 1
			else:
				max = pivot - 1		

	return "Not in list"


arr = [2,3,7,11,14,28,32]
ele = 32

print(binarySearch(arr,ele))
