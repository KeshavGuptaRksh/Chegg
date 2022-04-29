
def concatenate_total_length(s1,s2):
    '''The function return the concatenated string of the two arguments
        (s1 and s2) and the length of the concatenated string.

    >>> concatenate_total_length("Hello","world")
    "Hello, World" has a length of 12 characters

    >>> concatenate_total_length("Welcome to", "Canada")
    >>> concatenate_total_length("ECOR", "1041")
    >>> concatenate_total_length("", "")
    
    '''
    s1_Length = len(s1)
    s2_Length = len(s2)
    txt = "'{st1}, {st2}' has a total length of {sl1} characters".format(st1=s1,st2=s2,sl1=s1_Length+s2_Length)
    print(txt)


def replicate(s1,s2,rep):
    newtext=''
    ''' 
    The finction returns a string that is the result of concatenating the two strings arguments and replicating the concatenated string "rep" times.

    >>> replicate("a","b",2)
    'abc'
    >>> replicate("ab","c",2)
    'abcabc'
    >>> replicate("abc","d",2)
    'abcdabcd'
    '''
    for i in range(0,rep):
        newtext=newtext+s1+s2
    print(newtext)



concatenate_total_length('Hello','world')
concatenate_total_length("Welcome to","Canada")
concatenate_total_length('','')
replicate('a','b',2)
replicate('ab','c',2)
replicate('abc','d',3)