import java.util.Random;
import java.util.Scanner;

/**
 * DiceRoll
 */

public class DiceRoll {
    // Creating object of random class to generate a random numner
    Random rand = new Random();
    // Defining sides of dice
    int side = 12;
    // Array to store how many times a number is rolled
    int roll_count[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    Scanner sc = new Scanner(System.in);

    // Function to roll a dice for N number of times
    void dice_roll() {
        int n, result;
        ;
        System.out.println("How many times you would like to roll dice");
        n = sc.nextInt();
        System.out.println("-------------------------------");
        for (int i = 1; i <= n; i++) {
            // This statement will genarate a random number between 1 and 12
            result = (int) Math.floor(Math.random() * 12 + 1);
            roll_count[result - 1]++;
            // Call to a function to display each roll
            display_roll(result);
        }
        System.out.println("------------------------------");
    }

    // Definition of display_roll function
    void display_roll(int r) {
        System.out.println("You rolled a " + r);
    }

    // Function to display how many times a number is rolled
    void count_roll() {
        for (int i = 0; i < 12; i++) {
            System.out.println(i + 1 + " rolled " + roll_count[i] + " times");
        }
    }

    public static void main(String[] args) {
        DiceRoll ob = new DiceRoll();
        ob.dice_roll();
        System.out.println("Total Times each number rolled");
        ob.count_roll();
    }
}