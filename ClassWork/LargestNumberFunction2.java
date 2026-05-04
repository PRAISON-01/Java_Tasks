/*
LargestNumberFunction.java

write a function that takes in three numbers and prints out the largest of the numbers
*/


public class LargestNumberFunction2 {


    public static void main(String[] args){
        isLargest(70,-90000,500,0,0);
    }

    public static int isLargest(int first, int second, int third, int fourth, int fifth){
        
        int largest = first;
        if (second > largest){
            largest = second;
            System.out.print("Largest is "+second);
            System.out.println();
        return largest;
        }

        if(third > largest){
            largest = third;
        System.out.print("Largest is "+largest);
        System.out.println();
        return largest;
        }

        if(fourth > largest){
            largest = fourth;
        System.out.print("Largest is "+largest);
        System.out.println();
        return largest;
        }

        if(fifth > largest){
            largest = fifth;
        System.out.print("Largest is "+largest);
        System.out.println();
        return largest;
        }


        System.out.print("Largest "+largest);
        System.out.println();
        return largest;

    }


}
