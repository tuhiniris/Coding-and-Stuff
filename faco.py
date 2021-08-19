memo = {'key1':'wipro','key2':'iem','key3':'wb'}
print(memo['key2'])


def factorial(n):
	if n<=2:
		return n
	else:
		if n not in memo:
			memo[n] = (n)*factorial(n-1)
			return memo[n]
		else:
			print("In Cache : ",n)
			return memo[n]	

'''
print(factorial(10))
print(memo)
print(factorial(12))
print(factorial(12))
print(memo)
print(factorial(11))
'''
