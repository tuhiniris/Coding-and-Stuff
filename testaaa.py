memo = {0:0,1:1}
primediary = {}

def fibonacci(n):
	global memo
	if n in memo:
		return memo[n]
	else:
		memo[n] = fibonacci(n-1)+fibonacci(n-2)
		return memo[n]

def factorial(n):
	if n==1 or n==2:
		return n
	else:
		return n*factorial(n-1)	

def primecheck(n):
	flag = 0
	for i in range(2,n+1):
		if (n%i==0) and (n!=i):
			flag = 1
	if flag==0:
		return True
	else:
		return False	

print(fibonacci(100))			
print(factorial(5))
for i in range(100):
	primediary[i] = primecheck(i)
print(primediary)
