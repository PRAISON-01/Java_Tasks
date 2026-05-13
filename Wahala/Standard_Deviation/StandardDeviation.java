/*Write a program that calculates the standard deviation of a set of numbers
Population Standard Deviation was used here



sum up array to calculate mean
mean Deviation function: each data points - mean
square  deviation:| x - mean|^2
sum the squared deviation
calculate the variance: divide sum of X by for population or (n-1) for sample population 
take square root at the end 
*/

public class StandardDeviation{

    public static int add(int[] array){

        int sum = 0;
        for(int number : array){
        
            sum += number;
        }

        return sum;
    }

    public static double mean(int[] array){
	
        int mean = add(array)/array.length;

        return mean;
    }

    public static double meanDeviation(int[] array){

        double sum = 0;
        double calcMean = mean(array);
        double deviation = 0;
        for(int number : array){
           deviation = Math.abs(number - calcMean);

           sum += deviation;
        }

        return sum/array.length;
    }

    public static double squareOfMeanDeviation(int[] array ){

        double sum = 0;
        double calcMean = mean(array);
        double deviation = 0;
        double squareSum = 0;
        for(int number : array){
           deviation = (number - calcMean);

           squareSum += deviation * deviation;
        }

        return squareSum;

    }

    public static double variance(int[] array ){

        double dividend = squareOfMeanDeviation(array);
        int divisor = array.length;

        double quotient = dividend / divisor;

        return quotient;
    }

    public static double standardDeviation(int[] array){
        
        double standardDev = Math.sqrt(variance(array));
        return (standardDev);
    }

}
