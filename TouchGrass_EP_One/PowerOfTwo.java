import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter Power(2^?): ");
    int power = input.nextInt();

    for(int count = 1; count <= power; count++){
    double result = Math.pow(2 , count);
    System.out.println((int)result);
    }

    }
}
