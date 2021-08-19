arr = [9,4,3,1,8,7] #1,3,4,7,8,9

ele = int(input())
while(ele>0):
	head = arr[0] #IniPivot
	for i in range(len(arr)):
		if head<arr[i]:
			head = arr[i]	
	arr.remove(head)
	ele-=1

print(head)

