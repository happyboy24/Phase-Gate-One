CorrectAnswer = 0

print(" What is Good Morning in korean? ")
print("   (a) annyeonghaseyo (b) gutmoning (c) jo-eun achim  (d) jo-eun achim-ieyo" );
     
pick = input("Please enter your choice: ")
print(pick)

if pick == "c": 
        print("Excellent");
        CorrectAnswer += 1
      
elif pick == "a" or pick == "b" or pick == "d":
       print("wrong")
     
else:
     print("invalid input");
     

print("Who wrote 'Hamlet'? ")
print("       (a) Wole Soyinka (b) William Shakespeare (c) Mr Femi  (d) Chiamanda Achebe ");
     
choose = input("Please choose your choice: ");

if choose == "b": 
     print("Excellent");
     CorrectAnswer += 1;
     

elif choose == "a" or choose == "c" or choose == "d":
     print("wrong");
     
else:
     print("invalid input");
    

print("Where is jeju island located?");
print("        (a) Shanghai (b) Korea Strait (c) Thailand (d) South korea ");
     
type = input("Please type your choice: ");

if type == "d":
      print("Excellent");
      CorrectAnswer += 1;
     
elif type == "a" or type == "b" or type == "c":
     print("wrong");
     
else:
     print("invalid input");
    

print("What was the first computer virus?");
print(" (a) Creeper ");
print(" (b)  Reaper");
print(" (c)  Crow");
print(" (d)  Raven");
print("        (a) Creeper (b) Reaper (c) Crow (d) Raven ");
     
type = input("Please type your choice: ");

if type == "d":
      print("Excellent");
      CorrectAnswer += 1;
     
elif type == "a" or type == "b" or type == "c":
     print("wrong");
     
else:
     print("invalid input");


print("What is ILOVEYOU ?")
print("        (a) Computer worm (b) Show of emotion (c) Fartmart (d) Affection ");
     
type = input("Please type your choice: ");

if type == "a":
      print("Excellent");
      CorrectAnswer += 1;
     
elif type == "b" or type == "c" or type == "d":
     print("wrong");
     
else:
     print("invalid input");

     
     print(totalScore);
