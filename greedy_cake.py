from collections import *

def default_val():
	return False

memo = defaultdict(default_val)
profit = 0
cake_tuples = [(7, 15), (3, 160), (2, 75)] # Quantity,Price
capacity = 4

for i in range(len(cake_tuples)):
	memo[cake_tuples[i][0]]=cake_tuples[i][1]
	
while(capacity>0):
	print(memo)
	if len(memo)>0:
		maxkey = max(memo, key=memo.get)
		#print(maxkey)
		#Sprint(profit)
		profit=profit+memo[maxkey]
		if capacity-1>=0:
			capacity = capacity-1
		if maxkey>=1:
			memo[maxkey-1] = memo.pop(maxkey)
		else:
			del memo[maxkey]
	else:
		break

print(profit)
print(capacity)
