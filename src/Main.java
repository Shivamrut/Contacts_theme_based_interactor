import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.callMenu();
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        menu.setChoice(choice);

        while(menu.getChoice()==1 || menu.getChoice()==2){
            if(menu.getChoice()==1){
                menu.ManageContacts();
            }else {
                menu.ManageMessages();
            }
            menu.callMenu();
            choice = scan.nextInt();
            menu.setChoice(choice);
        }

        scan.close();
        menu.quitMenu();

    }
}