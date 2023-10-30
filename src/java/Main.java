public class Main {

    public static void main(String[] args) {
        PlayGalgje playGalgje = new PlayGalgje();
        playGalgje.InitializeGame();
        if (InputUser.getAnswer().equals("YES")){
            playGalgje.InitializeGame();
        }
        if (InputUser.getAnswer().equals("NO")){
            System.out.println("Byebye");
        }


    }

}
