// Harshal Patel
// Guessing the number game
// Java programming Internship

import java.util.*;

public class Guess_the_Num {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = (int) (100 * Math.random());
        int guess, again, score = 0;
        int rounds = 5;

        System.out.println("Hello, Welcome to the number Guessing game ");
        System.out.println("Enter the number between 1 to 100");
        int i;
        for (i = 0; i < 5; i++) {
            System.out.println("\n Try to Guess the number ");
            guess = in.nextInt();

            if (guess > 100 || guess < 0) {
                System.out.println("Ops Sorry, Please enter the number between 1 to 100");
                score += 10;
                System.out.println("Your score is " + score);
                break;
            } else if (guess > num && i != rounds - 1) {
                System.out.println("Ops! The number is less than " + guess);
            } else if (guess < num && i != rounds - 1) {
                System.out.println("Ops! The number is greater than " + guess);
            }
        }
        if (rounds == i) {
            System.out.println("You have completed the round");
            System.out.println("The number is " + num);
            System.out.println("Do you want to continue...");
            System.out.println("Enter 1 to continue...");
            again = in.nextInt();

            if (again == 1) {
                Guess_the_Num();
            } else {
                System.out.println("Thanks for playing");
            }
        }
        in.close();
    }

    public static void Guess_the_Num() {
    }
    
}
