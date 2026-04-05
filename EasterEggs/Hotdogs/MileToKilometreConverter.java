import java.util.Scanner;

public class MileToKilometreConverter {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many miles do you want to convert to Kilometres : ");
    double mile = input.nextDouble();
    double oneMile = 1.6;

    double km = mile * oneMile;
    System.out.printf("%.2f mile : %.2fkm%n", mile , km);
 }
}
