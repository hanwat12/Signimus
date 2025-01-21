package SignimusTechnologyTask;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println("Welcome to the Number Guassing Game !");
        while(playAgain){
            int randomNumber = random.nextInt(100) + 1;
            int attempts =0;
            int maxAttempts = 10;
            boolean guessedCorrectly = false;

            System.out.println("I have selected a number between 1 and 100 . can you guess it ? ");

            while(attempts < maxAttempts){
                System.out.println("Enter your guess  :");

                if(!scanner.hasNextInt()){
                    System.out.println("Invalid input. Please enter a number .");
                    scanner.next();  //Clear invalid input
                    continue;
                }

                int userGuess = scanner.nextInt();
                attempts++;

            if(userGuess < 1  ){

            }

        }
    }
    }
}
