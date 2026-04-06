import java.util.Scanner;

public class SimpleAndCompoundInterestCalc {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Principal: ");
    double principal = input.nextDouble();
    
    System.out.print("Enter Rate: ");
    double rate = input.nextDouble();

    System.out.print("Enter Time: ");
    double time = input.nextDouble();

    System.out.print("Enter Frequency: ");
    double freq = input.nextDouble();
    
    double si = (principal * rate * time) / 100;

    double ciBase = 1 + ((rate / 100) / freq);
    double ciIndex =  freq * time;
    double ci = (principal * Math.pow(ciBase, ciIndex)) - (principal);

    System.out.printf("Simple Interest: %f \nCompound Interest: %.2f\n",si , ci);
 }
}
