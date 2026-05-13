//public class TimeConverter{
//
//
//    public static void main(String[] args){
//
//        int minutes = 30;
//        System.out.print(getSeconds(minutes));
//
//    }
//
//    public static int getSeconds(int minutes){
//
//        int seconds = minutes * 60;
//        System.out.print(seconds);
//
//        return seconds;
//
//        int hour = minutes / 60;
//        System.out.print(hour);
//
//        return hour;
//
//        
//    }
//
//    public static int getHour(int minutes){
//
//       
//
//    }
//
//}




public class TimeConverter {

    public static void main(String[] args) {
        int minutes = 30;

        int seconds = getSeconds(minutes);
        int hours   = getHours(minutes);

        System.out.println("Minutes:  " + minutes);
        System.out.println("Seconds:  " + seconds);
        System.out.println("Hours:    " + hours);
    }

    
    public static int getSeconds(int minutes) {
        return minutes * 60;
    }

    public static int getHours(int minutes) {
        return minutes / 60;
    }
}

