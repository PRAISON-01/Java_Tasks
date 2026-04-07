import java.util.Scanner;

public class ByteConverter {
 public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of Bytes : ");
    double bytes = input.nextDouble();

    double kilo = bytes / 1024;
    double mega = bytes / Math.pow(1024, 2);
    double giga = bytes / Math.pow(1024, 3);

    System.out.printf("%f in Kilobytes: %.2f KB\n", bytes, kilo);
    System.out.printf("%f in Megabytes: %.2f MB\n", bytes, mega);
    System.out.printf("%f in Gigabytes: %f GB\n", bytes, giga);
 }     
}
