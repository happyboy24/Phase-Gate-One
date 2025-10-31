public class Perfectt {
    public static void main(String[] args) {



    int count = 2;

    boolean isSquare = false;
    
    int[] number = {4,8,9,12,16,25,49};
    
    for (int num = 0; num < number.length; num++) { 
	    int result = number[num];
   
    count = result / count;
    isSquare = false;
     
    if (count * count >= result) 
    isSquare = true; 

	count++;
    
   System.out.print( "." + isSquare);   
   }
  } 
 }


    

    

    