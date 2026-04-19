public class PrimeNumberLoop {
    public static void main(String[] args){
    
    int count = 1;
    int prime = 2;
    for(; prime < 1200; prime++){
        if (prime % prime == 0) System.out.print(prime + " ");
        if (count % 8 == 0) System.out.println(" ");
        count++;
    }

    }
}
