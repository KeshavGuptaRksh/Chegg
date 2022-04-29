angle1=int(input('Enter first angle of a triangle'))
angle2=int(input('Enter second angle of a triangle'))
angle3=int(input('Enter third angle of a triangle'))

if angle1+angle2+angle3==180:
    if angle1==angle2 and angle2==angle3:
        print('Equilateral Triangle')
    elif angle1==angle2 or angle2==angle3 or angle3==angle1:
        print('Isosceles Triangle')
    else:
        print('Scalene Triangle')
else:
    print('Not a traingle')