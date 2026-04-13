import java.util.Scanner;

public class SeniorCitizenChecker {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Birth year to check if you are Eligible for Senior Citizen Discount : ");
    int year = input.nextInt();

    if (year <= 1961) {
        System.out.println("You are Eligible for the citizen discount");
    }
    else {
        System.out.println("You are 'NOT' Eligible!");
    }
 }
}
