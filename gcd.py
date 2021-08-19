def gcd(a,b):
	while(b):
		a,b = b,a%b
	return a

print(gcd(19,3))
print(gcd(19,4))
