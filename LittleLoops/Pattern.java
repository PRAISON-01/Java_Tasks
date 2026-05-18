/*import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rowNumber = input.nextInt();
        
        for(int count = 1;count <= rowNumber; count +=1 ){
            for(int spaceumn = 1;spaceumn <= count; spaceumn++){
                System.out.print("*");
            }
        System.out.println();

        }

    }
}
*/

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int count = input.nextInt();

        while (count <1){
            System.out.print("Enter a valid-number: ");
            count = input.nextInt();        
        }
        
        for(int row = 1;row <= count; row +=1 ){
                System.out.print("*");
            for (int space = 1; space <= count; space++){
                  System.out.print("|");
            }
            for(int charcter = 1;charcter <= row; charcter++){
                System.out.print("");
                
            }
        System.out.println();

        }

    }
}
