n = 1234
ans = 0

while(n>0):
	temp = n%10
	ans = (ans*10)+temp
	n = n//10

print(ans)	

x = 1
y = 5
z = 1
for i in range(5):
	print((" ")*y,(("*")*x)*2)
	x+=1
	y-=1
	
