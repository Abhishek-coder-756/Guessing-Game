import java.util.Scanner;
import java.util.Arrays;
public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        for(int i=1;i<100;i++){
            System.out.println("Guess the number(1-100)");
            int guess = sc.nextInt();
            if(guess==myNumber){
                System.out.println("You win");
                break;
            }
            else if(guess>myNumber){
                System.out.println("You want to enter smallest number");
            }
            else if(guess<myNumber){
                System.out.println("You want to enter greatest number");
            }
            else{
                System.out.println("You enter incorrect number");
            }
        }
        System.out.println("My Number was");
        System.out.println(myNumber);
     
       
    }
}