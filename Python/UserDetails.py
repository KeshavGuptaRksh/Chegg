#imports

import csv 
import random
import os
import subprocess
import sys
import getpass
from turtle import heading
from unicodedata import name


def main():
    
    csvfile=open('/Users/keshavgupta/Chegg/Python/employee.csv','r')
    csvreader=csv.reader(csvfile)
    for i in range(0,7):
        name=next(csvreader)
        full_name.append(name)
    # creating a list with no duplicates 
    full_name1=[]
    for x in full_name:
        if x not in full_name1:
            full_name1.append(x)
    
    for name in full_name1:
        count=full_name.count(name)
        if count>1:
            user=name[1]+name[0][0]+name[1][-1]
            user_name.append(user)
            i=1
            for j in range(0,count-1):
                user_name.append(user+str(i))
                i+=1
        else:
            user_name.append(name[1]+name[0][0]+name[1][-1])
    csvfile.close()   


#Generate random password
def random_passwords(users):
    passwords=[]
    #generate random nunber between 10 - 999
    i=random.randint(10,999)
    for user in users:
        password=user+str(i)
        passwords.append(password)
    return passwords

#Add users
def add_users(full_name,user_name,passwords):
    for i in range(0,len(full_name)):
        #adding users one by one
        addUser = "sudo useradd -m"+full_name[i][0]+full_name[i][1]+user_name[i]+"-p"+passwords[i]
        subprocess.run(['useradd','-p',passwords[i],full_name[i][0]+full_name[i][1]+user_name[i]])
        os.system(addUser)


def create_csv(full_name,user_name,passwords):
    csvfile= open('/Users/keshavgupta/Chegg/Python/useraccounts.csv','w')
    csvwriter=csv.writer(csvfile)
    heading=['Firstname','Lastname','username','Password']
    csvwriter.writerow(heading)
    for i in range(0,len(full_name)):
        row=[full_name[i][0],full_name[i][1],user_name[i],passwords[i]]
        csvwriter.writerow(row)
    csvfile.close()

name=[]
full_name=[]
user_name=[]

passwords=random_passwords(user_name)
add_users(full_name,user_name,passwords)
create_csv(full_name,user_name,passwords)

if __name__=='__main__':
    main()