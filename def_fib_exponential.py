# Function for nth Fibonacci number
from collections import defaultdict
def def_val():
	return False

memo = defaultdict(def_val)
#memo[n]="Dutta"
#print(memo[1])

def Fibonacci(n):
	if n<0:
		print("Incorrect input")
	# First Fibonacci number is 0
	elif n==0:
		return 0
	# Second Fibonacci number is 1
	elif n==1:
		return 1
	else:
		if n not in memo:
			memo[n] = Fibonacci(n-1)+Fibonacci(n-2)
			return memo[n]
		else:
			return memo[n]			

# Driver Program

print(Fibonacci(350))

#This code is contributed by Saket Modi
