import java.util.*;
import java.util.Scanner;
public class GuessANumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Random randomNumber =new Random();
        int computerNumber = randomNumber.nextInt(100);
        while(true){
            System.out.println("Guess a number (1-100): ");
            String playerInput =scan.nextLine();
            int playerNumber;


            boolean isValid =true;
            for (int i = 0; i < playerInput.length(); i++) {
                if(playerInput.charAt(i)<48 || playerInput.charAt(i)>57){
                    isValid =false;
                    break;
                }
            }
            if(isValid) {
                 playerNumber = Integer.parseInt(scan.nextLine());
                if (playerNumber == computerNumber) {
                    System.out.println("You guessed! ");
                    break;
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
            } else {
                    System.out.println("Invalid input.");
                }
            }

        }
    }
