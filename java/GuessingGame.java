
/**
 * Program to simulate a guessing game
 * This program will generate a random number in a certain range defined by the user and ask the user to  
 * guess what the number is? User will be provided by the certain number of tries while we narrow down
 * the possibilities.  
 */

import java.util.Scanner;

/**
 * GuessingGame
 */
public class GuessingGame {
    // Declaring global variables to be used in our program
    static Scanner sc = new Scanner(System.in);
    // Defines the start of limit
    public static int start;
    // Defines end of the limit of our program
    public static int end;
    // Stores the random number generated within the gib=ven range
    public static int random;
    // Stores the number tries a user gets in our game
    public static int lives = 4;

    // This function will generate a random number between given range and returns
    // it
    int setRandom(int s, int e) {
        random = (int) (Math.random() * (e - s)) + s;
        return random;
    }

    /**
     * This function will actuallu simuate the guessing game. It will an input from
     * the user and checks
     * if that number is equals to the random number. If the condition is true user
     * will get a message
     * you won. Else it will check if a number is higher than random number it will
     * generate message
     * stating that the number is higher else it will generate the message lower
     * value and in both cases
     * lives will be reduced by one. This process will be repeated until lives
     * become zero or user guesses
     * the correct value.
     */
    void guess(int start, int end, int lives, int random) {
        System.out.println("I am thinking a number between " + start + " and " + end + ". Guess what it is :  ");
        while (lives > 0) {
            int val;
            // Input from user guessing the value
            val = sc.nextInt();
            // Cjecking if value equal to random number or not
            if (val == random) {
                System.out.println("Player guessed the right number");
                break;
            }
            // checking if value is greater than random value
            else if (val > random) {
                System.out.println("Too high! Try again");
                lives--;
            }
            // Statement for value less than random value
            else {
                System.out.println("Too low! Try again");
                lives--;
            }
            // checking if value is equal to zero and if yes print the approproate statement
            if (lives <= 0) {
                System.out.println("You Lost! The number was " + random);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("This is a guessing game");
        GuessingGame ob = new GuessingGame();
        System.out.println("Please enter the lowest and highest values for the range : ");
        start = sc.nextInt();
        end = sc.nextInt();
        ob.setRandom(start, end);
        ob.guess(start, end, lives, random);
    }
}