import math

a=float(input("a="))
b=float(input("b="))
c=float(input("c="))

if a==0:
    if b==0:
        print("Vo nghiem")
    else:
        print("x =", -c/b)
else:
    d=b*b-4*a*c
    if d<0:
        print("Vo nghiem")
    elif d==0:
        print("x =", -b/(2*a))
    else:
        x1=(-b+math.sqrt(d))/(2*a)
        x2=(-b-math.sqrt(d))/(2*a)
        print("x1 =",x1)
        print("x2 =",x2)