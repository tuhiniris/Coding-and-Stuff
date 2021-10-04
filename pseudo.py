import itertools

n = int(input())
m = int(input())
p = int(input())
e = int(input())

pencil = [i for i in range(1,n+1)]
eraser = [i for i in range(1,m+1)]

penp = list(itertools.combinations(pencil,p))
erap = list(itertools.combinations(eraser,e))

#print(penp)
#print(erap)

print(max(len(penp),(len(erap))))

'''
3
1
2
1
'''
