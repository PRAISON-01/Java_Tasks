/*
MaxMethod.java

get largest of three numbers
*/

public class MaxMethod{

    public static int maxOf(int[] numbers){

        int largest = numbers[0];

        for(int index = 1; index < numbers.length ; index++){
            if(numbers[index] > largest){
                largest = numbers[index];
            }
        }
        return largest;
    }

}
