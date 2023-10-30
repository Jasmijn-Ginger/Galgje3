public class Game {
    public boolean gameStillOn(int triesLeft, char[] word){
        if (triesLeft>0 && new String(word).contains("_")){
            return true;
        }
        return false;
    }

    public void gameWon() {
        System.out.println("Gefeliciteerd je hebt gewonnen! Het woord was: " + GalgjeWord.wordToBeGuessed);
    }

    public void gameLost() {
        System.out.println("Helaas, je hebt verloren. Het woord was: " + GalgjeWord.wordToBeGuessed);
    }


}
