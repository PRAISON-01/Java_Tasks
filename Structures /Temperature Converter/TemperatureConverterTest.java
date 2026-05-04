/*
TemperatureConverterTest.java

testThat0CelciusReturns32Farenheit

testThatCelciusToFarenheit100Returns212

testThatcelciusToFarenheitnegative40returnsnegative40
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TemperatureConverterTest{

    @Test
    public void testThat0CelciusReturns32Farenheit(){

        int celcius = 0;
        int  expected = 32;
        int actual = TemperatureConverter.celciusToFarenheit(celcius);
        assertEquals(actual, expected);
    }

    @Test
    public void testThatCelciusToFarenheit100Returns212(){

        int celcius = 100;
        int  expected = 212;
        int actual = TemperatureConverter.celciusToFarenheit(celcius);
        assertEquals(actual, expected);
    }


}

