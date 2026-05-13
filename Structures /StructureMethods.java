import java.util.Scanner;
public class StructureMethods{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Pentagonal NUmbers from 1 to 100:  ");

        for(int index = 0; index <= 100; index++){
            System.out.printf("%7d",getPentagonalNumber(index));

            if(index % 10 == 0){
                System.out.println();
            }
        }
       

        long x = 9876543210L;
        System.out.print("\nLong Sum: "+ getSumOf(x));

     
/*        
        System.out.print("Enter A Number: ");
        int number= input.nextInt();

        if(isTrue(number)){
            System.out.println(number + " Is a palindrome.");
        }
        else {
            System.out.println(number + " is 'NOT' a palindrome.");
        }
*/

    }
//Pentagonal Number

    public static int getPentagonalNumber(int number){
        int result = (number * ((3*number) - 1)) / 2;
        return result;
    }


//Long Sum

     public static long getSumOf(long number){
        long sum = 0;

        long temp = Math.abs(number);
        while(temp > 0){
            
            long digit = temp % 10;
            sum += digit;
            temp /= 10;
        } 
        return sum;
    }
//Reverse Method 3
    public static int getReverseOf(int number){
        int reversed = 0;
        while(number != 0){
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
    return reversed;
    }

    public static boolean isTrue(int number){
       return (getReverseOf(number) == number);
    }

//Reverse Method 4




}
