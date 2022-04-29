from turtle import goto


route_number = input('Please enter route number')
stops = int(input('Please enter number of stops on this route'))
current_passengers=0
total_passengers=47
for i in range(1,stops+1):
   
    waiting_passenger = int(input('How many passengers were waiting on stop #',i))
    if waiting_passenger>total_passengers:
        print('Maximum ',total_passengers,' are allowed')
    elif waiting_passenger<0:
        print('Invalid value, please enter again')
    