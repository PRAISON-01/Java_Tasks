/*Write a function that takes the string of a number and gives back the length*/


public class StringLengthFunction{

    public static void main(String[] args){
        
        String  word = "praise";
        System.out.print(digitCountByCounting(word));
    }

    public static int digitCountByCounting(String numberStr) {
   
    int count = 0;
    for (char c : numberStr.toCharArray()) {
        if (Character.isDigit(c)) 
        count++;
    }
    return count;
}
}

