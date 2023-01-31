import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    private int choice;

    Map<String, Integer> contacts = new HashMap<>();
    ArrayList<String > messages = new ArrayList<>();
    
    public void callMenu(){
        System.out.println("Hello user!");
        System.out.println("What would you like to do? ");
        System.out.println("\t1.Manage Contacts\n\t2.Manage Messages\n\t3.Quit");

    }

    public void setChoice(int choice){
       this.choice = choice;
    }

    public int getChoice(){
        return this.choice;
    }

    public void ManageContacts(){
        System.out.println("\t1.Show all Contacts.\n\t2.Add a new Contact.\n\t3.Search a Contact\n\t4.Delete a Contact\n\t5.Go back to previous menu");
        Scanner scan = new Scanner(System.in);
        int secondChoice = scan.nextInt();
        
        switch (secondChoice)
        {
            case 1:
            {
                if(contacts.isEmpty()){
                    System.out.println("Contacts is empty!!");
                    ManageContacts();
                }
                else{
                    contacts.forEach((k,v)-> System.out.println(k+": "+v));
                    ManageContacts();
                }
                break;
            }
            case 2:
            {
                System.out.println("How many contacts do you want to add?");
                int n = scan.nextInt();
                for(int i=0;i<n;i++){
                    System.out.println((i+1) + ". Enter name: ");
                    String name = scan.next();
                    System.out.println("Enter number: ");
                    int number = scan.nextInt();
                    contacts.put(name,number);
                }
                System.out.println("Contacts successfully added.");
                ManageContacts();
                break;
            }
            case 3:
            {
                System.out.println("Please enter contact name: ");
                String toFind = scan.next();
                if(contacts.get(toFind)==null){
                    System.out.println("No contact named "+ toFind + " exists!");
                }
                else System.out.println("Contact number is : "+ contacts.get(toFind));
                ManageContacts();
                break;
            }
            case 4:
            {
                System.out.println("Enter the name of the contact to be removed.");
                String toFind = scan.next();
                if(contacts.get(toFind)==null){
                    System.out.println("No contact named "+ toFind + " exists!");
                }
                else {
                    contacts.remove(toFind);
                    System.out.println("Successfully removed "+toFind+" from contacts.");
                }
                ManageContacts();
                break;

            }
            case 5:
            {
                System.out.println("Reloading Main Menu");
                break;
            }
            default:
                break;
        }

    }

    public void ManageMessages(){
        System.out.println("\t1.See the list a of all messages\n\t2.Send a new message\n\t3.Go back to previous menu");
        Scanner scan = new Scanner(System.in);
        int secondChoice = scan.nextInt();
        
        switch (secondChoice)
        {
            case 1:
            {
                if(messages.isEmpty()){
                    System.out.println("No messages to see!");
                }
                else{
                    for(int i=0;i<messages.size();i++){
                        System.out.println((i+1)+". "+ messages.get(i));
                    }
                }
                ManageMessages();
                break;
            }
            case 2:
            {
                System.out.println("Enter the message below: ");
                scan.nextLine();
                String msg = scan.nextLine();
                messages.add(msg);
                System.out.println("Successfully added message.");
                ManageMessages();
                break;
            }
            case 3:
            {
                System.out.println("Reloading Main Menu");
                break;
            }
            default:
                break;
        }
    }
    
    public void quitMenu(){
        System.out.println("Closing Application");
    }
    
}
