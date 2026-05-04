import java.util.Scanner;

public class PrimeSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        
        int total = 0;
        for (int count = 2; count <= number;){
            if(number % count == 0){
                number = number / count;
                total += count;
            }
            else{
                count++;
            }
            
        }
        System.out.print(total);
    }
}





/*        int sum = 0;
        int digit = 0;
        while (total > 0){
        digit = total % 10 ;
        total /= 10;
        sum += digit;
        }
        
*/


/*
int total = 0;
        for (int count = 2; count <= number; count++ ){
            digit =number % count == 0) {
                total += count;
            }
            if (number == 1)
                break;

*/
