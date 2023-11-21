import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){

        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100 (including both).");
        System.out.println(num);

        Scanner in = new Scanner(System.in);
        System.out.println("Guess what number I am: ");
        int guess = in.nextInt();
        guess1(num, guess);
    }
    public static void guess1(int num, int guess){
        Scanner in = new Scanner(System.in);
        if (guess > num) {
            System.out.println("Too high bud lol. Try again: ");
            int guess1 = in.nextInt();
            guess2(num, guess1);
        } else {
            if (guess < num) {
                System.out.println("Too low bud lol. Try again: ");
                int guess1 = in.nextInt();
                guess2(num, guess1);
            } else {
                if (guess == num){
                    System.out.println("Nice guess! Correct!!!!!! The number was " + num);
                }
                
            }
        }
    }
    public static void guess2(int num, int guess1){
        Scanner in = new Scanner(System.in);
        if (guess1 > num) {
            System.out.println("Too high bud lol. Try again: ");
            int guess2 = in.nextInt();
            guess3(num, guess2);
        } else {
            if (guess1 < num) {
                System.out.println("Too low bud lol. Try again: ");
                int guess2 = in.nextInt();
                guess3(num, guess2);
            } else {
                if (guess1 == num){
                    System.out.println("Nice guess! Correct!!!!!! The number was " + num);
                }
                
            }
        }
    }
     public static void guess3(int num, int guess2){
        if (guess2 > num) {
            System.out.println("Too high bud lol. That was your last try.");
        } else {
            if (guess2 < num) {
                System.out.println("Too low bud lol. Try again: ");
            } else {
                if (guess2 == num){
                    System.out.println("Nice guess! Correct!!!!!! The number was " + num);
                }
                
            }
        }
    }
}
