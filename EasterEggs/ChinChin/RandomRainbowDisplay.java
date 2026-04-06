public class RandomRainbowDisplay {
 public static void main(String[] args){
    int number = (int)(Math.random()* 7);
    String color = switch(number){
        case 1 -> "Red";
        case 2 -> "Orange";
        case 3 -> "Yellow";
        case 4 -> "Green";
        case 5 -> "Blue";
        case 6 -> "Indigo";
        case 7 -> "Violet";
        default -> "Unknown";
        };

    System.out.println("Number of Color : "+ number +" : color : "+ color);
 }
}
