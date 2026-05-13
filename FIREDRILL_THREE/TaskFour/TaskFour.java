/*
TaskFour.java

Write a function that takes an array and output an array containing the elements in the even index
*/

public static TaskFour {

    public static int[] getEvenIndexArray(int[] numbers){

        int size = (numbers.length + 1)/ 2;
        int[] evenIndexedArray = new int[size];
        int count = 0;

        for(int index = 0; index < numbers.length; index += 2){
            evenIndexedAray[count++] = numbers[index];
        }

    return evenIndexedAray;
    }

}
