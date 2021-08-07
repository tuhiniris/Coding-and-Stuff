from functools import lru_cache

x=0
def printAllKLength(setA, k):
	n = len(setA)
	printAllKLengthRec(setA, "", n, k)

def printAllKLengthRec(setA, prefix, n, k):
	
	if (k == 0) :
		global x
		x=x+1
		print(prefix) #uncomment this to see the number
		return
	
	for i in range(n):
		newPrefix = prefix +" "+ str(setA[i])
		count=0
		aa=newPrefix.split(" ")[1::]
		print("CHECK",aa)
		for i in range(len(aa)-1):
			if(int(aa[i+1])%int(aa[i])==0):
				count+=1
		if(count==len(aa)-1):
			printAllKLengthRec(setA, newPrefix, n, k - 1)


n=int(input())
set1=[i for i in range(1,n+1)]
k = int(input())
printAllKLength(set1, k)
print(x%10000)
