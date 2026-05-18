public class AirConditioner{

    boolean isOn;
    int temperature;

    public AirConditioner(int defaultTemp){
        isOn = false;
        temperature = defaultTemp;

    }

    public powerOn(){
        isOn = true;
    }

    public powerOff(){
        isOn = false;
    }

    public coolDown(){
        if(isOn = true && temperature > 16){
            temperature -= 1;
        }
    }
    
    public heatUp(){
        if(isOn = true && temperature < 30){
            temperature += 1;
        }
    }

    public boolean check(){
        return isOn;
    }

    public int getTemperature(){
        return temperature;
    }


}
