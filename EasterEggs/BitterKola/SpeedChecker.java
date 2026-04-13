import java.util.Scanner;

public class SpeedChecker {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a speed (Km/h) : ");
    int speed = input.nextInt();
    
    if (speed == 0) {
        System.out.println("Your vehicle is stationery");
    }
    else if (speed <= 40) {
        System.out.println("Your vehicle speed is SLOW!");
    }
    else if (speed <= 80) {
        System.out.println("Your vehicle speed is MODERATE! ");
    }
    else if (speed <= 120){
        System.out.println("Your vehicle speed is FAST!");
    }
    else {
        System.out.println("Your vehicle speed is DANGEROUSLY FAST!");
    }
 }
}
