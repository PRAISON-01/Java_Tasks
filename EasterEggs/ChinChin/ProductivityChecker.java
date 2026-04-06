import java.util.Scanner;

public class ProductivityChecker {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any you hourly Wage : ");
    double wph = input.nextDouble();

    System.out.print("Enter number of hours worked : ");
    double hours = input.nextDouble();
    
    double normalPay;

    if (hours <= 40) {
         normalPay = wph * hours;
    } else {
        double overTime = hours - 40;
         normalPay = (wph * 40) + (overTime * wph * 1.5);
    }
    
    System.out.println("Hours Worked : "+ hours +": Total Pay : "+ normalPay);
 }
}
