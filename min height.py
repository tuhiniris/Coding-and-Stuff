'''
Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once. After modifying, height should be a non-negative integer. 
Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.

Input:
K = 2, N = 4
Arr[] = {1, 5, 8, 10}
Output:
5
Explanation:
The array can be modified as 
{3, 3, 6, 8}. The difference between 
the largest and the smallest is 8-3 = 5.

Input:
K = 3, N = 5
Arr[] = {3, 9, 12, 16, 20}
Output:
11
Explanation:
The array can be modified as
{6, 12, 9, 13, 17}. The difference between 
the largest and the smallest is 17-6 = 11. 

Expected Time Complexity: O(N*logN)
Expected Auxiliary Space: O(N)

'''
from collections import *

def def_val():
	return False
memo = defaultdict(def_val)

#k = 2
#n = 4
#arr = deque([1,5,8,10])

#k = 3
#n = 5
#arr = deque([3, 9, 12, 16, 20])

#k = 5
#n = 10
#arr = [2, 6, 3, 4, 7, 2, 10, 3, 2, 1]

k = int(input())
n = int(input())
arr = list(map(int,input().split()))

right = max(arr)
left = min(arr)
print(right)
print(left)

# Greedy Comparisons

rightmore = right+k #10+2 = 12
print("Rightmore",rightmore)
rightless = right-k #10-2 = 8
print("Rightless",rightless)
leftmore = left+k #1+2 = 3
print("Leftmore",leftmore)
leftless = left-k #1-2 = -1
print("Leftless",leftless)

diffmin = rightmore-leftmore
print("Primary Diffmin",diffmin)

if (rightmore-leftless<diffmin) and (rightmore>=0) and (leftless>=0) :
	print("A")
	diffmin = rightmore-leftless
elif (rightless-leftless<diffmin) and (rightless>=0) and (leftless>=0) :
	print("B")
	diffmin = rightless-leftless
elif (rightmore-leftmore<diffmin) and (rightmore>=0) and (leftmore>=0) :
	print("C")
	diffmin = rightmore-leftmore
elif (rightless-leftmore<diffmin) and (rightless>=0) and (leftmore>=0) :
	print("D")
	diffmin = rightless-leftmore

print(abs(diffmin))			


'''

2
4
1 5 8 10

3
5
3 9 12 16 20

5
10
2 6 3 4 7 2 10 3 2 1

7

'''
