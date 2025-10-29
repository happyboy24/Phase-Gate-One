
	let correct = 0;
	let CorrectAnswer = 0;
	CorrectAnswer += correct;
	Console.log("What is Good Morning in korean? ");
	Console.log(" (a)  annyeonghaseyo");
	Console.log(" (b)  gutmoning");
	Console.log(" (c)  jo-eun achim");
	Console.log(" (d)  jo-eun achim-ieyo");


	Console.log(" Select your answer from the above options");
	String select = input.nextLine();


	if (select.equals("a") || select.equals("b") || select.equals("d") || select.equals(" "))
	Console.log("Incorrect Answer");
	
	
	else if (select.equals("c"))
	Console.log("correct" + CorrectAnswer);

	else {
	Console.log("Invalid input");
	}

	

		//CorrectAnswer++;


		input.nextLine();	

Console.log("Who wrote 'Hamlet'? ");
Console.log(" (a)  Wole soyinka");
Console.log(" (b)  William Shakespeare");
Console.log(" (c)  Mr Femi");
Console.log(" (d)  Chiamanda  Achebe");

Console.log(" Select your answer from the above options");
	String pick = input.nextLine();


	if (pick.equals("a") || pick.equals("c") || pick.equals("d") || pick.equals(" "))
	Console.log("Incorrect Answer");
	
	else if (pick.equals("b"))
	Console.log("correct" + CorrectAnswer);

	else {
	Console.log("Invalid input");
	}

	//CorrectAnswer++;

	input.nextLine();	

Console.log("Where is jeju island located?");
Console.log(" (a) Shanghai ");
Console.log(" (b)  Korea Strait");
Console.log(" (c)  Thailand");
Console.log(" (d)  South Korean");

Console.log(" Select your answer from the above options");
	String choice = input.nextLine();


	if (choice.equals("a") || choice.equals("b") || choice.equals("c") || choice.equals(" "))
	Console.log("Incorrect Answer");
	
	
	else if (choice.equals("d"))
	Console.log("correct" + CorrectAnswer);

	else {
	Console.log("Invalid input");
	}

	//CorrectAnswer++;

input.nextLine();	

Console.log("What was the first computer virus?");
Console.log(" (a) Creeper ");
Console.log(" (b)  Reaper");
Console.log(" (c)  Crow");
Console.log(" (d)  Raven");

Console.log(" Select your answer from the above options");
	String choose = input.nextLine();


	if (choose.equals("a"))
	Console.log("correct " + CorrectAnswer);
	
	else if (choose.equals("b") || choose.equals("c") || choose.equals("d") || choose.equals(" "))
	Console.log("Incorrect Answer");

	else {
	Console.log("Invalid input");
	}
	

	//CorrectAnswer++;

	input.nextLine();	

Console.log("What is ILOVEYOU ?");
Console.log(" (a) Computer worm ");
Console.log(" (b)  Show of Emotional");
Console.log(" (c)  Fartmart");
Console.log(" (d)  Affection");

Console.log(" Select your answer from the above options");
	String click = input.nextLine();


	if (click.equals("a"))
	Console.log("correct " + CorrectAnswer);
	
	else if (click.equals("b") || click.equals("c") || click.equals("d") || click.equals(" "))
	Console.log("Incorrect Answer");

	else {
	Console.log("Invalid input");
}

	//CorrectAnswer++;
	CorrectAnswer++;

	Console.log("You scored:" + CorrectAnswer + " " + "of 5!");
        
	
}





}