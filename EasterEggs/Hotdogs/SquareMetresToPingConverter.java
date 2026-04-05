import java.util.Scanner;

public class SquareMetresToPingConverter{
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many Square Metre do you want to convert to ping : ");
    double squareMetre = input.nextDouble();
    double onesqMetre = 0.3025;

    double ping = squareMetre * onesqMetre;
    System.out.printf("%.2f SquareMetre : %.2f Ping %n", squareMetre , ping);
 }
}
