public class Messages {
    private String text;
    private String recipient;
    private int id;

    public Messages(String text, String recipient, int id) {
        this.text = text;
        this.recipient = recipient;
        this.id = id;
    }

    public void getDetails(){
        System.out.println("Contact name: "+ recipient+"\nContact id: "+id+ "\n"+text+"\n");
    }
    
}
