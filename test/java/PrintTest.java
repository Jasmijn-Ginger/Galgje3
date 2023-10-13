import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class PrintTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    Print print = new Print();

    @Test
    public void displayEmptyLines(){
        //Given
        char[] expectedOutcome = {'_', '_', '_', '_', '_'};
        print.setEmptyLines(GalgjeWord.wordToBeGuessed);
        //When
        char [] result = print.emptyLines;
        //Then
        Assertions.assertEquals(new String(expectedOutcome), new String(result));
    }

}
