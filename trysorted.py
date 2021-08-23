#trysorted
import random

arr = [random.randint(1,9999) for _ in range(1000000)]
arr.sort()


n = int(input())
print(arr[-n])
