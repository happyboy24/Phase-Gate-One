import java.util.Scanner;
import java.util.Random;
//import DateTime.DateTime;
public class SimpleArithmeticAppp {

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	Random random = new Random();

	int ConfirmedAnswer = 0;

	System.out.println("I WELCOME YOU TO SIMPLE ARITHMETIC APP");

	for(int count = 1; count <= 10; count++){
	int number1 = random.nextInt(50) + 1;
	int number2 = random.nextInt(number1) + 1;
	int correct = number1 - number2;
	System.out.println(count + number1 + " - " + number2 + " = ");
	System.out.println("Enter your answer:");
	int usersinput = input.nextInt();

if (usersinput == correct){
	ConfirmedAnswer += correct;
	ConfirmedAnswer++;
System.out.println("Correct Answer");
}
else {
System.out.println("Incorrect Answer");
System.out.println(count + number1 + " - " + number2 + " = ");
}
	
//System.out.println("Total score: " + ConfirmedAnswer );
}
System.out.println("Total score: " + ConfirmedAnswer );


}


}


