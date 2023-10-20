import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InputUserTest {


    void provideInput(String data) {
        ByteArrayInputStream testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @Test
    void givenName_whenReadFromInput_thenReturnCorrectResult() {
        provideInput("a");
        String input = InputUser.getInputUser();
        Assertions.assertEquals("A", input);
    }
}
