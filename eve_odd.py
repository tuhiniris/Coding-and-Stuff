arr = [9,4,3,1,8,7] #1,3,4,7,8,9
eve = []
odd = []

for i in range(len(arr)):
	if arr[i]%2==0:
		eve.append(arr[i])
	else:
		odd.append(arr[i])	

print(sum(eve))
print(sum(odd))
