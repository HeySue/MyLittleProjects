import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class GuessNumber{
    
    public static void main(String[] args){

        System.out.println("I'm thinking of a numebr");
        System.out.println("Please type in the max number");

        Scanner scanner = new Scanner(System.in);
        int higherBoundary = scanner.nextInt();

        int secret = 1 + (int) (Math.random() * higherBoundary);

        System.out.println("Please guess a number between 1 and "+ higherBoundary);
        int guess = -1;
        int cnt = 1;
        int min = 1;
        int max = higherBoundary;
        while (guess != secret){
            System.out.println("What's your guess? (No."+cnt+")");
            guess = scanner.nextInt();
            if (guess == 0)         System.out.println("The answer is "+secret);
            else if (guess == -1)        System.out.println("The current min is "+ min + ", max is " + max);
            else {
                cnt += 1;

                if (guess < secret){
                    System.out.println("Too low!");
                    min = Math.max(min, guess);
                } 
                else if (guess > secret){
                    System.out.println("Too high!");
                    max = Math.max(min, guess);
                } 
                else System.out.println("You Win!!!!");
            }
            
        }
        scanner.close();
    }
}