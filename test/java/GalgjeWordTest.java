import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GalgjeWordTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    @Test
    public void CreateGalgjewordTest(){
        //Given
        String expectedOutcome = "groen";
        //When
        String result = galgjeWord.createGalgjeWord();
        //Then
        Assertions.assertEquals(expectedOutcome, result);
    }

    @Test
    public void GalgjeWordArray(){
        //Given
        char[] expectedOutcome = {'g', 'r', 'o', 'e', 'n'};
        galgjeWord.createGalgjeWord();
        galgjeWord.arrayWordToBeGuessed();
        //When
        char[] result = galgjeWord.arrayWordToBeGuessed();
        //Then
        Assertions.assertEquals(new String(expectedOutcome), new String(result));
    }



}
