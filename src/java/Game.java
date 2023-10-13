public class Game {
    public boolean gameStillOn(int triesLeft, char[] word){
        if (triesLeft>0 && new String(word).contains("_")){
            return true;
        }
        return false;
    }

    public void gameWon() {
        System.out.println("gewonnen");
    }

    public void gameLost() {
        System.out.println("verloren");
    }


}
