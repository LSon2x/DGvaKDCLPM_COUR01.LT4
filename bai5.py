n=int(input("Nhap n: "))

if n<2:
    print("Khong phai so nguyen to")
else:
    kt=True
    for i in range(2,int(n**0.5)+1):
        if n%i==0:
            kt=False
            break
    if kt:
        print("So nguyen to")
    else:
        print("Khong phai so nguyen to")