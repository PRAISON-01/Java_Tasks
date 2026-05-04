/*
LargestNumberFunction.java

write a function that takes in three numbers and prints out the largest of the numbers
*/


public class LargestNumberFunction {


    public static void main(String[] args){
        isLargest(70,-90000,500);
    }

    public static int isLargest(int first, int second, int third){
        System.out.printf("Largest Between %s, %s and %s%n", first, second, third);

        int largest = first;
        if (second > largest){
            largest = second;
            System.out.printf("Largest Between %s, %s and %s is %s%n", first, second, third, largest);
        return second;
        }
        if(third > largest){
            largest = third;
        System.out.printf("Largest Between %s, %s and %s is %s%n", first, second, third, largest);
        return third;
        }
        System.out.printf("Largest Between %s, %s and %s is %s%n", first, second, third, largest);
        return largest;

    }


}
