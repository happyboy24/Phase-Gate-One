import java.util.Scanner;
public class TheQuiz {
	public static void main(String[]args){
	        Scanner input = new Scanner(System.in);

	int correct = 0;
	int CorrectAnswer = 0;
	CorrectAnswer += correct;
	System.out.println("What is Good Morning in korean? ");
	System.out.println(" (a)  annyeonghaseyo");
	System.out.println(" (b)  gutmoning");
	System.out.println(" (c)  jo-eun achim");
	System.out.println(" (d)  jo-eun achim-ieyo");


	System.out.println(" Select your answer from the above options");
	String select = input.nextLine();


	if (select.equals("a") || select.equals("b") || select.equals("d") || select.equals(" ")) {
	System.out.println("Incorrect Answer");
}
	
	
	else if (select.equals("c")) {
	System.out.println("correct" + CorrectAnswer);
	CorrectAnswer++;
}

	else {
	System.out.println("Invalid input");
	}

	

		
		input.nextLine();	

System.out.println("Who wrote 'Hamlet'? ");
System.out.println(" (a)  Wole soyinka");
System.out.println(" (b)  William Shakespeare");
System.out.println(" (c)  Mr Femi");
System.out.println(" (d)  Chiamanda  Achebe");

System.out.println(" Select your answer from the above options");
	String pick = input.nextLine();


	if (pick.equals("a") || pick.equals("c") || pick.equals("d") || pick.equals(" ")) {
	System.out.println("Incorrect Answer");
	CorrectAnswer++;
	
}
	else if (pick.equals("b")) {
	System.out.println("correct" + CorrectAnswer);
	}

	else {
	System.out.println("Invalid input");
	}

	
	input.nextLine();	

System.out.println("Where is jeju island located?");
System.out.println(" (a) Shanghai ");
System.out.println(" (b)  Korea Strait");
System.out.println(" (c)  Thailand");
System.out.println(" (d)  South Korean");

System.out.println(" Select your answer from the above options");
	String choice = input.nextLine();


	if (choice.equals("a") || choice.equals("b") || choice.equals("c") || choice.equals(" ")) {
	System.out.println("Incorrect Answer");
	CorrectAnswer++;

	}
	
	else if (choice.equals("d")) {
	System.out.println("correct" + CorrectAnswer);
	}
	else {
	System.out.println("Invalid input");
	}

	input.nextLine();	

System.out.println("What was the first computer virus?");
System.out.println(" (a) Creeper ");
System.out.println(" (b)  Reaper");
System.out.println(" (c)  Crow");
System.out.println(" (d)  Raven");

System.out.println(" Select your answer from the above options");
	String choose = input.nextLine();


	if (choose.equals("a")) {
	System.out.println("correct " + CorrectAnswer);
	CorrectAnswer++;
}
	
	else if (choose.equals("b") || choose.equals("c") || choose.equals("d") || choose.equals(" ")) {
	System.out.println("Incorrect Answer");
}

	else {
	System.out.println("Invalid input");
	}
	

	

	input.nextLine();	

System.out.println("What is ILOVEYOU ?");
System.out.println(" (a) Computer worm ");
System.out.println(" (b)  Show of Emotional");
System.out.println(" (c)  Fartmart");
System.out.println(" (d)  Affection");

System.out.println(" Select your answer from the above options");
	String click = input.nextLine();


	if (click.equals("a")){
	System.out.println("correct " + CorrectAnswer);
	CorrectAnswer++;
}
	else if (click.equals("b") || click.equals("c") || click.equals("d") || click.equals(" ")){
	System.out.println("Incorrect Answer");
}

	else {
	System.out.println("Invalid input");
}

		System.out.println("You scored:" + CorrectAnswer + " " + "of 5!");
        
	
}





}