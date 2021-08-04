#Print("N^P=", power (N,P))
from collections import defaultdict
import sys
sys.setrecursionlimit(5000)

def def_val():
	return False
memo = defaultdict(def_val)

def power(N,P):
	if P==0:
		return 1
	elif P==1:
		return N
	else:
		if N not in memo:
			memo[N]= (N*power(N,P-1))
			return memo[N]
		else:
			memo[N]	


import math
N,P = map(int,input().split())
#X = int(input())
#arr = list(map(int,input().split()))
#ans = int(math.pow(N,P))
#ans = N**P
ans = power(N,P)

print(str(N)+"^"+str(P),"=",ans)			
			
