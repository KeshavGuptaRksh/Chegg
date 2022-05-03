#Creating originl List
sample_list=[1,2,3,4,5,6,7,8,9,10,50]
#declaring an empty list for storing values greater than last value of list
result_list=[]
#Storing last value of list in this variable
last_value=list1[-1]
#Use loop to iterate through each value 
for value in sample_list:
    #Check if a value is greater that last value and if yes store in it result list
    if(value>last_value):
        result_list.append(value)
#Fianlly display the list containing all the value greater than last value of list
print(result_list)