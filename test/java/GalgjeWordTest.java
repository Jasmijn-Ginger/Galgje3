import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GalgjeWordTest {

    GalgjeWord galgjeWord = new GalgjeWord();
    public String givenGalgjeWord = "groen";
    @Test
    public void CreateGalgjewordTest(){
        //When
        String expectedResult = galgjeWord.createGalgjeWord();
        //Then
        Assertions.assertEquals(givenGalgjeWord, expectedResult);
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
