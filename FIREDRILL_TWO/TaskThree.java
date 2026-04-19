/*collect 10 scores and print sum
collect 10 scores and print average
collect 10 scores and print sum and average
collect 10 scores and print sum of the ecen indexes(2nd number, 4th number, 10th number)
collect 10 scores and print sum of only the even numbers in the collected score
print average of task 5
print sum and average of task 5
collect 10 valid scores between 0-100 and print sum
collect 10 scores and sum only valid
print average from task 9*/

import java.util.Scanner;

public class TaskThree {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int score;
    int counter = 1;
    int total = 0;
    while(counter <= 10) {
        System.out.print("Enter Score you want to sum: ");
        score = input.nextInt();
        total += score;
        counter++;
    }
    int average = total/10;
    System.out.println("The Sum of the 10 score is "+ total);
    System.out.println("The average of the 10 scores is "+ average);
 }
}
