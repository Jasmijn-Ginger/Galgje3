import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameMasterTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    GameMaster gameMaster = new GameMaster();
    GalgjeWordTest galgjeWordTest = new GalgjeWordTest();
    InputUser inputUser = new InputUser();



    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }



    @Test
    public void displayEmptyLines(){
        //Given
        char[] expectedOutcome = {'_', '_', '_', '_', '_'};
        gameMaster.setEmptyLines(GalgjeWord.wordToBeGuessed);
        //When
        char [] result = gameMaster.emptyLines;
        //Then
        Assertions.assertEquals(new String(expectedOutcome), new String(result));
    }

    @Test
    public void loopTest(){
        gameMaster.loop();
        Assertions.assertEquals("Dit moet er staan", outputStreamCaptor.toString().trim());

    }


}
