from collections import defaultdict
import random
import functools

def def_val():
	return False
memo = defaultdict(def_val)
def factorial(n):
	global count
	if n<=1:
		return 1
	else:
		if n not in memo:
			memo[n] = (n)*factorial(n-1)
	
	return memo[n]

print("BEFORE MEMOISATION")			
print(memo)
print(factorial(10))
print(memo)
print("AFTER MEMOISATION")	
print(memo)
print(factorial(10))
print(memo)
