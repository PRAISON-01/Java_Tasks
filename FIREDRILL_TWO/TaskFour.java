/*collect 10 scores and print sum
collect 10 scores and print average
collect 10 scores and print sum and average
collect 10 scores and print sum of the even indexes(2nd number, 4th number... 10th number)
collect 10 scores and print sum of only the even numbers in the collected score
print average of task 5
print sum and average of task 5
collect 10 valid scores between 0-100 and print sum
collect 10 scores and sum only valid
print average from task 9*/

import java.util.Scanner;

public class TaskFour {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int score;
    int counter = 1;
    int total = 0;
    int evenCounter = 0;
        while(counter <= 10) {
        System.out.print("Enter Score you want to sum: ");
        score = input.nextInt();
        if (counter % 2 == 0){
            evenCounter+= score;
            }
        
        counter+= 1;
    }
    System.out.println("The Sum of the even indexes is "+ total);
 }
}
