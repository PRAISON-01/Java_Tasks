public class OneToHundredLoop {
    public static void main(String[] args){
        for(int first = 0; first <= 9 ; first++){
            
            for(int second = 0; second <= 9; second++ ){

                for(int third = 0; third <= 9; third++){

                    for(int fourth = 0; fourth <= 9; fourth++){
                        System.out.println(" "+ first+ second+ third+ fourth);
                    }
                }
            }
        
    }
}
}
