import math

n=int(input("Nhap n: "))

if n<=0:
    print("Khong hop le")
else:
    s=0
    for i in range(1,n+1):
        s+=math.factorial(i)
    print("Tong =",s)