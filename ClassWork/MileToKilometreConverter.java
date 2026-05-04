import java.util.Scanner;

public class MileToKilometreConverter {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many miles do you want to convert to Kilometres : ");
    int mile = input.nextInt();
    int oneMile = 1.6;

    int km = mile * oneMile;
 }
}
