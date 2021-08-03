# Given a list of integers, find the highest product you can get from three of the integers.
arr = [1,2,1,5,6]
arr.sort(reverse=True)
print(arr[0]*arr[1]*arr[2])
