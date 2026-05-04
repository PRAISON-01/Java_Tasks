/*
GreetMethodTest.java

testThatGreetAliceReturnsHelloAlice

testThatGreetWorldReturnsHelloWorld

testThatGreet!ReturnsHello!
*/

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GreetMethodTest{

    @Test
    public void testThatGreetAliceReturnsHelloAlice(){

        String name = "Praise Nwankwo";
        String actual = GreetMethod.greet(name);
        String expected = "Hello Praise Nwankwo";
        assertEquals(actual, expected);
    }

    @Test 
    public void testThatGreetWorldReturnsHelloWorld() {

        String name = "World";
        String actual = GreetMethod.greet(name);
        String expected = "Hello World";
        assertEquals(actual, expected);
    }

     @Test 
    public void testThatGreetSymbolReturnsHelloSymbol() {

        String name = "!";
        String actual = GreetMethod.greet(name);
        String expected = "Hello !";
        assertEquals(actual, expected);
    }
}
