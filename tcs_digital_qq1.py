# Recursive Power TCS
from functools import lru_cache
from sys import setrecursionlimit

setrecursionlimit(5000)

@lru_cache(maxsize=10000)
def powy(x,y):
	if y==0 or y==1:
		return x
	else:
		return x*(powy(x,y-1))

a,b = (map(int,input().split()))
ans = powy(a,b)
print(str(a)+"^"+str(b),"=",ans)
