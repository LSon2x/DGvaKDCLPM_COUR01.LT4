import math

a=int(input("Nhap a: "))
b=int(input("Nhap b: "))

if a==0 and b==0:
    print("Khong hop le")
else:
    print("UCLN =", math.gcd(a,b))