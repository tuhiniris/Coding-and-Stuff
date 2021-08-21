memo = {}

def fact(n):
	if n==0:
		return 0
	elif n==1:
		return n
	else:
		if n not in memo:
			memo[n] = n*fact(n-1)
			return memo[n]			

print(fact(5))
