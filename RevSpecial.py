# This is a coding question for reversing a string

def specialrev(x):
	if len(x)==1 or len(x)==2:
		return x
	else:	
		arr = list(x)
		sword = arr.pop(0)
		enword = arr.pop(len(arr)-1)
		arr.reverse()
		word = sword + ("".join(arr)) + enword
		return(word)

print(" ".join(list(map(specialrev,list(map(str,input().split()))))))
from blackhc.progress_bar import with_progress_bar

for _ in with_progress_bar(range(50)):
	import time
	time.sleep(0.04)
