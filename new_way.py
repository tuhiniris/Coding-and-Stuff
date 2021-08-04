k = int(input())
n = int(input())
arr = list(map(int,input().split()))

higharray = []
lowarray = []

for i in range(n):
	higharray.append(arr[i]+k)
	higharray.append(arr[i]-k)

print(higharray)
print(lowarray)




'''

2
4
1 5 8 10

3
5
3 9 12 16 20

5
10
2 6 3 4 7 2 10 3 2 1



'''
