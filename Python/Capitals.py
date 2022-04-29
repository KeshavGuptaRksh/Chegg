
#Create a dictionary with countries as keys and capitals as values
import random

capitals={'Qatar':'Doha','Italy':'Rome','UK':'London','France':'Paris','Egypt':'Cairo','Kuwait':'Kuwait','Russia':'Moscow'}

# define a function which will display country name and and ask user to gues the capital
choice=True
while choice:
    ans=0
    country = random.choice(list(capitals.keys()))
    print('Enter the capital of ',country,' : ')
    cap=input()
    if cap in capitals.values():
        ans+=1
    c=input('Press Y to quit')
    if c=='y' or c=='Y':
        choice=False

print('Total Correct Answers : ',ans)

