/*
Write a program that collect 10 input that collect 10 inputs from a user and store it in an array
*/

import java.util.Scanner;
public class KataKata {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        int[] array = new int[10];

        for(int counter = 1; counter <= 10; counter++){
            System.out.print("Enter Number: ");
            array [counter] = input.nextInt();
            if(counter > 10)
            break;
        }
        for(int counter = 0; counter < array.length; counter++){
            System.out.print(array[counter] +" ");
        }

    }

}

