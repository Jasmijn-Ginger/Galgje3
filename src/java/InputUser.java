import java.util.Scanner;

public class InputUser {

    public String chosenLetter = getInputUser().next().toUpperCase();
    public Scanner getInputUser() {
        Scanner ChooseALetter = new Scanner(System.in);
        System.out.print("\nWhich letter do you want to guess? ");
        return ChooseALetter;
    }
}
