import java.util.Scanner;

public class SecondCalculator {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of Seconds : ");
    int seconds = input.nextInt();

    int hour = seconds / 3600;
    int minutes = (seconds % 3600) / 60;
    int second = seconds % 60;

    System.out.printf("Normal Time is : %d hour, %d minutes , %d seconds\n", hour , minutes , second );

 }     
}
