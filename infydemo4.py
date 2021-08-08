from collections import defaultdict
from functools import lru_cache

def def_val():
	return False
memo = defaultdict(def_val)

@lru_cache(maxsize = None)
def checker(x,y):
	if ((x&y)*2)<(x|y):
		return True
	

'''
left = (5&12) *2
right = (5|12)

print(left)
print(right)
'''

arr = []
n = int(input())
for i in range(n):
	arr.append(int(input()))
	
print(arr)


'''

7
17
16
12
2
8
17
17

3


'''
