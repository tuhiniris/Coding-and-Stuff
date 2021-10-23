memo = {0:0,1:1}

def fibonacci(n):
	global memo
	if n in memo:
		return memo[n]
	else:
		memo[n] = fibonacci(n-1)+fibonacci(n-2)
		return memo[n]

def factorial(n):
	if n==0 or n==1:
		return 1
	else:
		return n*factorial(n-1)	

def primecheck(n):
	flag = 0
	for i in range(2,n+1):
		if (n%i==0) and (n!=i):
			flag = 1
			break
	if flag==0:
		return True
	else:
		return False	

def isort(arr):
	for i in range(len(arr)):
		temp = arr[i]
		j = i-1
		while(j>=0 and temp<arr[j]):
			arr[j+1] = arr[j]
			j-=1
		arr[j+1] = temp		

print(fibonacci(50))			
print(factorial(5))
primediary = {}
for i in range(100):
	primediary[i] = primecheck(i)

print(primediary)
arr = [2,11,9,21,2,1,3,7]
isort(arr)
print(arr)

