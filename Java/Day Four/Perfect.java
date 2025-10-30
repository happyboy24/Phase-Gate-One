public class Perfect {

	  public int totalNumberInTheArray() {

	return 0;
}
	public String addWord(String Word) {

	return "Invalid Input";
}
	public int addNumber() {

	return 0;
}

	public static void perfectsquare() {
	
    int count = 2;

    boolean isSquare = false;
    
    int[] number = {4,8,9,12,16,25,49};
    
    for (int num = 0; num < number.length; num++) { 
	    int result = number[num];
   
    count = number[num] / count;
    isSquare = false;
     
    if (count * count == number[num]) 
    isSquare = true; 

	count++;
    
   	return perfectsquare();  
   }

}

}