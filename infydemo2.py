from collections import defaultdict
import itertools

def def_val():
	return False

def checkdivisible(a,b):
	if b%a==0:
		return True
	else:
		return False	

memo = defaultdict(def_val)

n = int(input())
k = int(input())
ans = 0
arr = [i for i in range(1,n+1)]
print(arr)
container = (list(itertools.product(arr, repeat = k)))
print(container)
for i in range(len(container)):
	if container[i] in memo:
		ans+=1
	else:
		continue
		
print(memo)
print(ans)
