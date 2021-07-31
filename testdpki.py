# Function for nth fibonacci
# number - Dynamic Programming
# Taking 1st two fibonacci nubers as 0 and 1
FibArray = [0, 1]
from collections import defaultdict
def def_val():
	return False
	
memo = defaultdict(def_val)	
def fibonacci(n):

	# Check is n is less
	# than 0
	if n <= 0:
		print("Incorrect input")		
	else:
		temp_fib = fibonacci(n - 1) + fibonacci(n - 2)
		if (n-1) not in memo:
			memo[n-1] = (temp_fib)
			return temp_fib
		else:
			return memo[n-1]	

# Driver Program
print(fibonacci(9))
print(memo)
#print(FibArray)

# This code is contributed by Saket Modi
