public class Print {

    GalgjeWord galgjeWord = new GalgjeWord();
    public char[] emptyLines = new char[getGalgjeWord().length()];

    public String getGalgjeWord(){
        galgjeWord.createGalgjeWord();
        return GalgjeWord.wordToBeGuessed;
    }

    public void setEmptyLines(String word) {
        for (int i = 0; i < word.length(); i++) {
            emptyLines[i] = '_';
        }
    }
}
