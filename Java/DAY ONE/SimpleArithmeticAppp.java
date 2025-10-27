import java.util.Scanner;
import java.util.Random;
//import DateTime.DateTime;
public class SimpleArithmeticAppp {

	public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	Random random = new Random();

	int GottenAnswer = 0;

	System.out.println("I WELCOME YOU TO SIMPLE ARITHMETIC APP");

	for(int count = 1; count <= 10; count++){
	int number1 = random.nextInt(50) + 1;
	int number2 = random.nextInt(number1) + 1;
	int gotten = number1 - number2;
	System.out.println(count + number1 + " - " + number2 + " = ");
	System.out.println("Enter your answer:");
	int userinput = input.nextInt();

if (userinput != gotten){
	GottenAnswer += gotten;
	GottenAnswer++;
System.out.println("Correct Answer");
}
else {
System.out.println("Incorrect Answer");
System.out.println(count + number1 + " - " + number2 + " = ");
}
	
//System.out.println("Total score: " + GottenAnswer );
}
System.out.println("Total score: " + GottenAnswer );


}


}


