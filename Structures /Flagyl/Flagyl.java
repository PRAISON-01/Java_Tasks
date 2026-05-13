import java.util.Arrays;
public class Flagyl{

    public static void main(String[] args){

        int a = 25;
        System.out.print(isPrime(a));
    }



    public static boolean isPrime(int number){

        if( number < 1){
            return false;
        }
        if(number < 3){
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0){
            return false;
        }

        int i = 5;
        while(i * i <= number){

            if(number % i == 0 || number % (i + 2) == 0){
                return false;
            }
            i += 6;
        }
        return true;

    }

    public static int[] getOddEvenCount(int[] numbers){
         int evenCount = 0;
         int oddCount = 0;

        for(int number : numbers){
           
            if(number % 2 == 0){
                evenCount += 1;
            }
            else{
                oddCount+=1;
            }
        
        }
        
        int[] count = {evenCount, oddCount};
        return (count);
    }

//Question 5
//    public static double m(int i){
//
//        
//    }
//    

    public static 

}
