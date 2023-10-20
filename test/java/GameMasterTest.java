import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class GameMasterTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    GameMaster GameMasterTest = new GameMaster();

    @Test
    public void displayEmptyLines(){
        //Given
        char[] expectedOutcome = {'_', '_', '_', '_', '_'};
        GameMasterTest.setEmptyLines(GalgjeWord.wordToBeGuessed);
        //When
        char [] result = GameMasterTest.emptyLines;
        //Then
        Assertions.assertEquals(new String(expectedOutcome), new String(result));
    }

}
