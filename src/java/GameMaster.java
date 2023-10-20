public class GameMaster {

    GalgjeWord galgjeWord = new GalgjeWord();
    public char[] emptyLines = new char[getGalgjeWord().length()];
    String[] listGuessedLetters = {};

    public String getGalgjeWord(){
        galgjeWord.createGalgjeWord();
        return GalgjeWord.wordToBeGuessed;
    }

    public void setEmptyLines(String word) {
        for (int i = 0; i < word.length(); i++) {
            emptyLines[i] = '_';
        }
    }

    public String welcomMessage(){
        return "Welkom bij Galgje. Je kan 10 fouten maken om het woord te raden. Succes!";
    }


    public void loop() {
        System.out.println("Dit moet er staan");
    }
}
