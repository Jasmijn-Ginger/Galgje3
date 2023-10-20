import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GalgjeWordTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    @Test
    public void CreateGalgjewordTest(){
        //Given
        String expectedOutcome = "groen";
        //When
        String expectedResult = galgjeWord.createGalgjeWord();
        //Then
        Assertions.assertEquals(expectedOutcome, expectedResult);
    }

    @Test
    public void GalgjeWordArrayTest(){
        //Given
        char[] expectedOutcome = {'g', 'r', 'o', 'e', 'n'};
        galgjeWord.createGalgjeWord();
        galgjeWord.arrayWordToBeGuessed();
        //When
        char[] expectedResult = galgjeWord.arrayWordToBeGuessed();
        //Then
        Assertions.assertEquals(new String(expectedOutcome), new String(expectedResult));
    }



}
