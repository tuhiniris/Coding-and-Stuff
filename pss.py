from collections import OrderedDict
memo = OrderedDict()
n = int(input())
arr = list(map(int,input().split()))

hashes = list(set(arr))
hashes.sort(reverse=True)
print(hashes)

for i in range(len(hashes)):
	memo[hashes[i]]=arr.count(hashes[i])

print(memo)

for i in range(len(memo)):
	if memo[hashes[i]]==hashes[i]:
		print(hashes[i])
		break
'''

8
2 7 2 3 4 3 2 3

10
2 4 4 4 4 3 3 3 5 7

'''

