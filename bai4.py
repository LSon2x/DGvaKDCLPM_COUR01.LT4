thang=int(input("Nhap thang: "))
nam=int(input("Nhap nam: "))

if thang<1 or thang>12:
    print("Thang khong hop le")
elif thang in [1,3,5,7,8,10,12]:
    print(31)
elif thang in [4,6,9,11]:
    print(30)
else:
    if (nam%400==0) or (nam%4==0 and nam%100!=0):
        print(29)
    else:
        print(28)