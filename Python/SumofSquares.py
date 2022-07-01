#Function to find sum of squares of digits of a number
def sum_Of_Squares(num):
    sum=0
    # Loop to extract last digit and add it's square to the sum variable 
    while num!=0:
        #Extracting last digit
        ld=num%10
        #Squaring last digit and adding it to sum variable
        sum=sum+(ld**2)
        #Removing last digit of original number
        num=num//10
    #Returning the value of sum
    return sum


#Function to Create sequence of numbers till we reach 1 or 4
def sequence(num):
    # Storing the sum of squares of digit in n
    n=sum_Of_Squares(num)
    #Checking if n is equals to 1 or 4
    if(n==1 or n==4):
        print(n)
    else:
        print(n)
        sequence(n)
#Calling sequence function
sequence(12)