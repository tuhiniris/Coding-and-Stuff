from math import ceil
r1=int(input())
n=int(input())
r2=int(input())
x=int(input())
total_travelling_hr=ceil(x/60)

rupees_first=r1*n
if total_travelling_hr>n:
    rupees_first=r1*n
    rupees_last=r2*(total_travelling_hr-n)
else:
    rupees_first=total_travelling_hr*r1
    rupees_last=0
print(rupees_first+rupees_last)
