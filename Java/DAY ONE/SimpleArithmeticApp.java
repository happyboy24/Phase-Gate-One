import java.util.Scanner;
import java.util.Random;


public class SimpleArithmeticApp {

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	Random random = new Random();

		int Answer = 0;
		int questionchoice = 0;
		System.out.println("I WELCOME YOU TO SIMPLE ARITHMETIC APP");

		
        System.out.println("Enter a number: ");
        int userChoice = input.nextInt();

        int questionChoice = random.nextInt(10);
 	 String[] choices = {"if  you were given birth to in the year of the Dragon(1978-1989) and you are currently 43 years old in 2025, what year was birth year", 
 "what is  45000 subtracted by 24000",        "subtract 12  by 6", 
"if a liter of petrol is 890 and you wanted to get 5 liters while the fuel attendant gave you petrol of 5000 naira value, how much excess was added", "what is 5600 multiplied by 12 then subtracted by 2800", "what is 100 subtracted by 38", "what is 67000 subtract by 6700", "if you are robbed of 5 apple and you have 10 apple but you are owing ur sister what is the total number of apple left with you ", "what is 50 subtracted by 25", "what is 24 subtracted 11" };

System.out.println("The question is " + choices[questionChoice] + ".");
	int Questionchoice = input.nextInt();

 if (questionChoice == Answer){
	System.out.print("Correct Answer");

}
 else if (questionChoice != Answer){
	System.out.println("Wrong Answer");
System.out.println("The question is " + choices[questionChoice] + ".");
	int questionchoice = input.nextInt();
}

else  {
    System.out.print();

            //System.out.println("Current score: userScore + " - " + questionScore" );


}

}




}