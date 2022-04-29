sub_total = float(input('Enter the subtotal of the bill'))
tip=input('Do you wish to enter tip (Y/N)')
if tip=="y" or tip =='Y':
    choice=int(input('Press\n1 To enter a specific amount\n2 To enter a percentage'))
    if choice==1:
        amt=float(input('Enter tip amount'))
        tip_amout=amt
    else:
        per=float(input('Enter tip percentage'))
        tip_amout=(sub_total*per)/100

tax = .13*sub_total
total_amount = sub_total+tax+tip_amout

print('Reciept')
print('Subtotal:: ',sub_total)
print('Tax Owed:: ',tax)
print('Tip:: ',tip_amout)
print('Final Total:: ',total_amount)