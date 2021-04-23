import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {
    @ParameterizedTest(name= "pass {0} should return pass length {1}")
    @CsvSource ({"a, false", "aa, false" , "aaa, true"})
    public void checkLength(String pass, boolean expected) {
        assertEquals(expected, PasswordValidation.checkPasswordLength(pass, 0));
    }

    @ParameterizedTest(name= "pass {0} should return if number exists {1}")
    @CsvSource ({"Bunny88, true", "WithoutNumber, false" , "Mr4lf4, true", "4Mr, true", "2, true"})
    public void checkForNumbers(String password, boolean hasNumber){
        assertEquals(hasNumber, PasswordValidation.checkForNumber(password));
    }
}