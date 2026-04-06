import java.util.Scanner;

public class HypothenusCalc {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length of Opposite side of a triangle: ");
    double opp = input.nextDouble();

    System.out.print("Enter length of Adjacent side of the triangle: ");
    double adj = input.nextDouble();

    double hyp = Math.sqrt(Math.pow(opp, 2) + Math.pow(adj, 2));
    System.out.printf("Hypothenus: %.2f\n", hyp);
 }
}
