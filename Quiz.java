import java.util.Scanner;


class Quiz {
	public static void main(String[] args) {
		//start scan
		Scanner myObj = new Scanner(System.in);
		System.out.println("Welcome Wilder to THE new quiz in java way. If you want to play, please choose a nickname ");
		String name = myObj.nextLine();
		System.out.println("nickname: " + name);
		System.out.println("  To answer the following questions, just put the letter :   ");
		//tableau
		String[] theGreatArrey = {
			"If i lounch the 'git add' command in terminal, what is the status of my file ?  a.Commited  b.Untracked c.roasted d.tracked  ", 
			"d",
			"What happen to my device if I wrote 'rm -rf/' in the terminal ?  a.Order a pizza from Venisia  b.remove all files  c.lounch a game  d. i get fired  ",
			"b",
			"what the difference between double and float in java ?  a.Nothing  b.around four billions  c.3.14  d.size of your drunken way",
			"b",
			"what means Integer.parseInt in java ?  a.Converted String to Int  b.Converted double to char  c.Confund them all   d.I don't give a fuck",
			"a",
			"What's the Major diference between Steve Jobs and Elon Musk ?  a.One of them is alive  b.eat an Apple  c.one never drive  d.those two are billionaries bastards",
			"a",
			"why my fucking program is a master piece ? a.because is not  b.because bitcoin  c.Because we made it d.what programs ?",
			"c" 
			 };

		// poser une question
		askQuestion(theGreatArrey, 0);

	}

	//methode
	public static void askQuestion(String[] questions, int position ) {
		int score = 0;
	//loop
		for (int i = 0;i < 6;i++) {
			String question = questions[position];
			String reponse = questions[position + 1];
			System.out.println(question);
			Scanner myObj = new Scanner(System.in);
			String answer = myObj.nextLine();
			position = position + 2;
	//Condition
			if( reponse.equals (answer) ) {
				score = score + 1;
				System.out.println("Good game ! ");
			}
			else{
				System.out.println("ooh, such a noob you are  ");

			}
			System.out.println("your score: " + score);
		}
	// Fin du jeu
		System.out.println("this is the end...of this wonderful game. Your score is:  " + score);
		int totalScore = score;
		if(score < 4) {
			System.out.println("you a piece of shit");
		}
		else {
			System.out.println("you a badass");
		}

	}
}
