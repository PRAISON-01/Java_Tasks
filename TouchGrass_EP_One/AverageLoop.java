import java.util.Scanner;

public class AverageLoop {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number or enter -1 to stop : ");
        int number = input.nextInt();
        int total = 0;
        int count = 0;
        while (number != -1){
        total += number;
        count += 1;
        System.out.print("Enter number or enter -1 to stop : ");
        number = input.nextInt();
        }
        int average = total / count;
        System.out.println("Average of numbers: "+ average);
    }
}
