//Write a program that uses a while loop to compute the products of integers from 1 to 10
public class TenFactorialLoop {
 public static void main(String[] args) {
    int factorial = 1;
    int i = 1;
    while (i<=10) {
    factorial *= i;
    ++i;
    }
    System.out.println("Products of numbers from 1 to 1o (10!) : "+ factorial);
 }
}
