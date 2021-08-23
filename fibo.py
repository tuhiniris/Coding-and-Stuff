import sys

memo = {0:0,1:1}

def fibo(n):
	if n not in memo:
		memo[n] = fibo(n-1)+fibo(n-2)
		return memo[n]
	else:
		return memo[n]	

n = int(input())
sys.setrecursionlimit(n)

for i in range(1,n+1):
	fibo(i)
	if i==n:
		print("The Fibonacci of",i,"is :",fibo(i))				
