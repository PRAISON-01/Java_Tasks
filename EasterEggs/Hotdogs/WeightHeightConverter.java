import java.util.Scanner;

public class WeightHeightConverter {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Weight in Pounds (lb) : ");
    double pounds = input.nextDouble();
    
    System.out.print("Enter Height in Inches : ");
    double inches = input.nextDouble(); 

    double weight = pounds * 0.45359237;
    double height = inches * 0.00254;

    System.out.println("Weight in Kilograms : "+ weight);
    System.out.println("Height in metres : "+ height);
 }
}
