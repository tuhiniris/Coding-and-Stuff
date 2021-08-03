from collections import defaultdict

def default_val():
	return False
	
memo = defaultdict(default_val)	

def fibonacci(n):
	if n==0:
		return 0
	if n==1:
		return 1	
	else:
		if n not in memo:
			memo[n] = fibonacci(n-1)+fibonacci(n-2)
			return memo[n]
		else:
			return memo[n]

print(memo)
print(fibonacci(500))
print(memo)
