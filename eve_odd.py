arr = [9,4,3,1,8,7] #1,3,4,7,8,9

try:
	for i in range(len(arr)):
		try:
			if arr[i]%2!=0:
				arr.remove(arr[i])
		except:
			continue		
except:
	pass

print(arr)
	
