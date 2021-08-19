def checking(arr1,arr2):
	try:
		for i in range(len(arr1)):
			for j in range(len(arr1[0])):
				if (arr1[i][j])!=(arr2[i][j]):
					return 0
		return 1
	except:
		return 0				


arr1 = [[1,2,3],[4,5,6],[11,12,13]]
arr2 = [[1,2,3],[4,5,6],[11,12,13]]


print ("Yes" if(checking(arr1,arr2))==1 else "No")
