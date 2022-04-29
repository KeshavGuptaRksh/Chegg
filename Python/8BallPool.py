from random import randint


message=("Don't crush on it","My reply is no",'My sources say so','outlook not so good','Very doubtful',"All I see it, yes",'Most Likely','Outlook good','Signs point to yes','Yes','It is certain','It is decidedly so','Withoput a doubt','Yes-definitely','Ypu may rely on it','Reply hazy, try again','Better not tell you now','Concentrate and ask again')

count=[0]*len(message)


quit =True
while quit:
    question = input("Clear the mind and ask your yes/no question\n")
    choice=randint(0,len(message))
    count[choice]+=count[choice]+1
    print(message[choice],count[choice])
    c=input('Press y to quit')
    if c=='y' or c=='Y':
        quit=False

for i in count:
    if i==0:
        print(message[i])
        break
   