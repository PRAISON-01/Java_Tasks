
import java.util.Scanner;

public class InsuranceDeduction {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter any Salary Amount : ");
    double salary = input.nextDouble();

    double deduction;
    if (salary <= 50000) {
        deduction = salary * 0.00;
    } else if (salary <= 150000) {
        deduction = salary * 0.05;
    } else if (salary <= 500000){
        deduction = salary * 0.075;
    } else {
        deduction = salary * 0.1;
    }
    
    double netSalary = (salary - deduction);
    System.out.println("Social Insurance Deduction : "+ deduction);
    System.out.println("Net Salary : "+ netSalary);
 }
}
