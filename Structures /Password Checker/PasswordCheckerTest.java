/*
PasswordCheckerTest.java 

testThatPasswordIsAtleast10Characters
testThatPasswordDoesNotContainSpecialCharacters
testThatPasswordHasAtleast3Digits
testThatIfPasswordIsValidReturnValidPassord
testThatIfPasswordIsValidReturnValidPassord
*/
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordCheckerTest {

    @Test
    public void testThatPasswordIsAtleast10Characters(){
        boolean isValid = PasswordChecker.validPassword("password");
        assertTrue(isValid);
    }

}

