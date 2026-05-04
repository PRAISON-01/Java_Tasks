/*
TaskOne.java

collect 10 scores and put them in an array
*/
import java.util.Scanner;

public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int[] scores = new int[10];
    int index;
    for(index = 0; index < scores.length ; index++){
        System.out.print("Enter a score: ");
        scores[index] = input.nextInt();
    
    
}
