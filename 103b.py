def highcost(a,b):
	import math
	a = math.floor(math.sqrt(a*b))
	b = a

def lowcost(a,b):
	if(a%2==0):
		a = a//2
	elif(b%2==0):
		b = b//2
	elif(b%2!=0 and a%2!=0):
		if(b//2)<(a//2):
			b=b//2
		else:
			a=a//2

memo = {}
#a,b = map(int,input().split())
a = 2
b = 2

import heapq

arr = [6,5,1,3,11,18,19,23,2,7,6,4,22]
heapq.heapify(arr)
print(arr)

print(arr[-2])


