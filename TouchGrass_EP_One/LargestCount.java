import java.util.Scanner;

public class LargestCount{
    public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter number or 'o' to stop: ");
    int number = input.nextInt();

    int count = 1;
    int largest = 0;
    while(number != 0){
    System.out.println(count);
    System.out.print("Enter number or 'o' to stop: ");
    number = input.nextInt();
    
    count++;
        if(number > largest){
            largest = number;
        }

    }
    System.out.println(largest);
    }
}
