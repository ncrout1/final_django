# Online Python compiler (interpreter)
# Write and run Python online using this editor.

print("What does the Visualize button do?")
l="My name is narsingh"
word=""
newarray=[]
for i in range(len(l)):
  if(l[i]!=" "):
    word+=l[i]
  else:
    wordlen=len(word)-1
    j=0
    newword=""
    
    while(j<=wordlen):
      newword+=word[j]
      j=j+1
    newword+=str(wordlen+1)
    newarray.append(newword)
    word=""
    
wordlen=len(word)-1
j=0
newword=""
    
while(j<=wordlen):
      newword+=word[j]
      j=j+1
newword+=str(wordlen+1)
newarray.append(newword)
print(newarray)
finalword=" ".join(newarray)
print(finalword)
      
      
    