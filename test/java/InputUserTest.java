import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class InputUserTest {

    private static final PrintStream standardOut = System.out;
    private static final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeAll
    public static void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterAll
    public static void tearDown() {
        System.setOut(standardOut);
    }

    @BeforeEach
    public void clearOutputStreamBuffer(){
        outputStreamCaptor.reset();
    }

    InputUser inputUser = new InputUser();

    @Test
    public void getChosenLetter(){
        //When
        inputUser.getInputUser();
        //Then
        Assertions.assertEquals("Which letter do you want to guess? ", outputStreamCaptor.toString().trim());
    }
}
