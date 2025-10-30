def perfect_square(test_list):

  

	is_Square = False
    
number = [4,8,9,12,16,25,49];
  
count = 2  
for num in range(len(number)): 
	    result = number[num]

count = result /count
is_Square = False
     
if count * count >= result:
    is_Square = True

count = count + 1
    
print(result , "." , is_Square)



    

    

    