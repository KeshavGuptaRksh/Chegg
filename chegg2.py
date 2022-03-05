def get_valid_int(i_score):
    while i_score == None:
        s_score = input('Enter score: ')
        try:
            i_score=int(s_score)
        except:
            print('Not a valid integer')

cutoff_list = [90,80.70,60]
grade_list = ['A','B','C','D','F']
i_score = get_valid_int('Enter score: ')
grade = 'F'
for i in range(len(cutoff_list)):
    if not i_score >= cutoff_list[i]:
        grade=grade_list[i]
        break
print('grade = ',grade)