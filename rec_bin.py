def binarysearch(arr,start,end,ele):
	global ans
	mid = (start+end)//2
	if arr[mid]==ele:
		ans = mid
	elif arr[mid]<ele:
		binarysearch(arr,mid+1,end,ele)
	elif arr[mid]>ele:
		binarysearch(arr,start,mid-1,ele)
	return ans					

ans = -1	
arr = [1,4,6,7,9,11]
errors = []
for i in range(len(arr)):
	try:		
		print(binarysearch(arr,0,len(arr),arr[i]))
	except:
		errors.append(arr[i])
		pass	

if len(errors)>1 : print(errors)
