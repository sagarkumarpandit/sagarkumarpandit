import java.util.*;

public class numberGames {
    
    //Creating a function to generate NumberGame

    public static void NumberGame() {
        //Declaring lower and upper boundry
        int minRange = 1;
        int maxRange = 100;

        //Declaring other variables like guessed number,present round,current score,current attempt
        int guessNumber;
        int round = 0;
        int score = 0;
        int attempt;

        System.out.print("Enter number of attempts you want in each round: ");
        Scanner scanner = new Scanner(System.in);
        int lastattempt = scanner.nextInt();
        System.out.println("you have total " + lastattempt + " attempts in each round");

        //For generating random numbers,used Inbuilt method Random()
        Random random = new Random();

        //running loop
        while(true) {

        attempt = 1;
        round++;

        System.out.println();
        System.out.println("round" + round);
        System.out.println();

        //Initialising Generating number
        int gennumber = random.nextInt(maxRange-minRange-1) + minRange;


        do {
            System.out.print("Guess the number between " + minRange + " and " + maxRange +": ");

            //Taking input from the user the guess number
            Scanner sc = new Scanner(System.in);
            guessNumber = sc.nextInt();

            //using conditional operator to check whether the guess number is equal to the generated number or not
            if(guessNumber < 0 || guessNumber > 100) {
                System.out.println("Invalid Number Input");
            }
              else if(guessNumber == gennumber) {
                score+=attempt;
                System.out.println("congratulation you got the correct guess " + gennumber  + " in " + score + " attempt");
            } else if(guessNumber > gennumber) {
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }

            attempt++;

        } while(attempt <= lastattempt && guessNumber != gennumber);//untill the present attempt is less than or equal to last attempt assigned and the guess number is not equal to the generated number, this loop will run

        //asking the user if he wants to play again or not
        System.out.print("play again (yes/no): ");


        Scanner sc = new Scanner(System.in);
        String result = sc.next().toLowerCase();

        //if the user writes anything other than yes the it will sum up the result/score
        if( !result.equals("yes")) {
        System.out.println("your score in " + round + " round is " + (score));
            System.out.println("Thanks for playing!");
            break;
        }
    }
    }

    public static void main(String args[]) {
        //calling the function from the main function
        NumberGame();
    }
}
