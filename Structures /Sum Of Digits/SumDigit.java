/*
SumDigit.java

*/


public class SumDigit{

    public static void main(String[] args){


    long x = 9876543210L;

    System.out.print(getSumOf(x));
    }

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

}
