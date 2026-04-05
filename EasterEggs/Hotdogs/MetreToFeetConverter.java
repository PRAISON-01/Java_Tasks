import java.util.Scanner;

public class MetreToFeetConverter {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many Metre do you want to convert to Feet : ");
    double metre = input.nextDouble();
    double oneMetre = 3.2786;

    double feet = metre * oneMetre;
    System.out.printf("%.2f metre : %.2f feet %n", metre , feet);
 }
}
