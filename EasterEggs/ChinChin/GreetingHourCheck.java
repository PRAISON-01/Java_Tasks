import java.util.Scanner;

public class GreetingHourCheck {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any Hour : ");
    int hour = input.nextInt();
    String greeting = switch (hour) {
    case 5, 6, 7, 8, 9, 10, 11 -> "Good Morning!!!";
    case 12, 13, 14, 15, 16, 17 -> "Good Afternoon!!!";
    case 18, 19, 20, 21 -> "Good Evening!!!";
    case 22, 23, 24, 1, 2, 3, 4 -> "Good Night!!!";
    default -> "Unknown Hour";
    };

    System.out.println(greeting);

 }
}
