from collections import defaultdict

def def_val():
	return False

powermemo = defaultdict(def_val)
maxans = []

n = int(input()) #monsters
e = int(input()) #experience points
power = [] #power of monster
bonus = [] #bonus for defeating monster

for i in range(n):
	power.append(int(input()))
for i in range(n):
	bonus.append(int(input()))

if e>=max(power):
	maxans.append(n)
	print("SESH")
else:
	for i in range(n):
		powermemo[power[i]]=bonus[i]

	power.sort()
	print(power)
	print(powermemo)
	ans = 0
	for i in range(n):
		if e>=power[i]:
			print(ans)
			ans+=1
			e+=powermemo[power[i]]
			print(e)

print(ans)

'''

2
123
78
130
10
0
--> 2

3
100
101
100
304
100
1
524
--> 2

3
15
25
15
11
5
1
11

4
1
1
1
4
1
1
1
1
1

4
4
1
1
4
1
1
1
1
1

'''
