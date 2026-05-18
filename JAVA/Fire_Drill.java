import java.util.ArrayList;

public class Example {
    public static int[] reverseArray(int[] array) {
        int[] newArray = new int[array.length];
        
        int count = 0;
        for(int index = array.length - 1; index >= 0; index--) {
            newArray[count] = array[index];
            count++;
        }
    
        return newArray;
    }
    
    public static int[] removeEven(int[] array) {
        int count = 0;
        for(int number: array) {
            if(number % 2 == 1)
                count++;
        }
        
        int[] newArray = new int[count];
        
        int counter = 0;
        for(int number: array) {
            if(number % 2 == 1)
                newArray[counter++] = number;
        }
    
        return newArray;
    }
    
    public static int[] removeOdd(int[] array) {
        int count = 0;
        for(int number: array) {
            if(number % 2 == 0)
                count++;
        }
        
        int[] newArray = new int[count];
        
        int counter = 0;
        for(int number: array) {
            if(number % 2 == 0)
                newArray[counter++] = number;
        }
    
        return newArray;
    }
    
    public static int[] removeDuplicate(int[] array) {
        ArrayList<Integer> integerArray = new ArrayList<Integer>();
        
        for(int number: array) {
            if(!integerArray.contains(number))
                integerArray.add(number);
        }
        
        int[] newArray = new int[integerArray.size()];
        
        int count = 0;
        for(int number: integerArray) {
            newArray[count++] = number;
        }
    
        return newArray;
    }
}
