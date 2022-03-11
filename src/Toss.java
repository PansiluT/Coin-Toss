import java.util.Random;
import java.util.Scanner;

public class Toss {
    public void flip(){
        Random randomNum = new Random();
        int rng = randomNum.nextInt(2);

        if (rng == 0){
            System.out.println("Heads!");
        }
        else {
            System.out.println("Tails!");
        }

        System.out.println(rng);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to coin toss");
        Toss coin_toss = new Toss();
        int choice;

        do {
            Scanner choice_input = new Scanner(System.in);
            System.out.println("Enter 1 to Toss-coin or 0 to Exit");
            choice = choice_input.nextInt();
            if (choice == 1){
                coin_toss.flip();
            }
            else if (choice == 0){
                System.out.println("Exiting..");

            }
            else {
                System.out.println("Invalid Choice...");
            }
        }
        while (choice != 0);
    }



}

