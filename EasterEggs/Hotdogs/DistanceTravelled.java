import java.util.Scanner;

public class DistanceTravelled {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Acceleration  : ");
    int acceleration = input.nextInt();

    System.out.print("Enter Speed : ");
    int speed = input.nextInt();

    double length = Math.pow(speed, 2) / 2 * acceleration;

    System.out.println("Distance Travelled : "+ length);
    
 }
}
