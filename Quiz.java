import java.util.Scanner;

class Quiz {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Welcome Wilder to THE new quiz in java way. If you want to play, please choose a nickname");
        String name = myObj.nextLine();
        System.out.println("Nickname: " + name);
        System.out.println("To answer the following questions, just put the letter :");

        String[] questions = {
                "If I launch the 'git add' command in terminal, what is the status of my file ?  a.Commited  b.Untracked c.Roasted d.Tracked",
                "d",
                "What happens to my device if I wrote 'rm -rf/' in the terminal ?  a.Order a pizza from Venisia  b.Remove all files  c.Launch a game  d. I get fired",
                "b",
                "What the difference between double and float in java ?  a.Nothing  b.Around four billions  c.3.14  d.Size of your drunken way",
                "b",
                "What means Integer.parseInt in java ?  a.Convert String to int  b.Convert double to char  c.Confound them all   d.I don't give a damn",
                "a",
                "What's the Major diference between Steve Jobs and Elon Musk ?  a.One of them is alive  b.Eat an Apple  c.One never drive  d.Both are bastard billionaires",
                "a",
                "Why is my freaking program a master piece ? a.Because it's not  b.Because of bitcoin  c.Because we made it d.What program ?",
                "c"
        };

        askQuestion(questions, 0);
    }


    public static void askQuestion(String[] questions, int position) {

        int score = 0;
        for (int i = 0; i < 6; i++) {
            String question = questions[position];
            String response = questions[position + 1];
            System.out.println(question);
            Scanner myObj = new Scanner(System.in);
            String answer = myObj.nextLine();
            position = position + 2;

            if (response.equals(answer)) {
                score = score + 1;
                System.out.println("Good game !");
            } else {
                System.out.println("Ooh, such a noob you are !");
            }
            System.out.println("Your score is: " + score);
        }
        // Fin du jeu
        System.out.println("This is the end...of this wonderful game. Your score is:  " + score);
        int totalScore = score;
        if (score < 4) {
            System.out.println("You're a piece of shoe !");
        } else {
            System.out.println("You're a badass !");
        }
    }
}
