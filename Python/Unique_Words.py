textfile = open('/Users/keshavgupta/Chegg/Python/text1.text','r') 
text = textfile.read()
text = text.lower()
words = text.split()
unique=[]
for word in words:
    if word not in unique:
        unique.append(word)

unique.sort()
print(unique)