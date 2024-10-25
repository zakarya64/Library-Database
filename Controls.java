import java.util.Scanner;
public class Controls
{
    private Database database;
    private Patron patron1;
    public Controls(){
    
    database = new Database();
    patron1 = new Patron();
    
    }
    
    public int selectPatron(){
    int n;
    Scanner reader = new Scanner(System.in);
    for(int i = 0; i < n; i++){
    
    System.out.println(database.getPatron(n));
    }
    System.out.println("Please select a patron: ");
    int patron = reader.nextInt();
    return patron;
  
    
    
    }
    
    public int displayMainChoices(){
    
        
    
    
    }
    
    public void printPatrons(){
    
    int n;
    for(int i = 0; i < n; i++){
    
    System.out.println(database.getPatron(n));
    }
    
    
    }
    
    public void displayPatronBooks(int patron){
    
    
    
    
    
    }
    
    public void patronBorrowBook(int patron){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please enter a title: ");
        String title = reader.nextLine();
        System.out.println("Please enter an author: ");
        String author = reader.nextLine();
        patron1.borrowBook(title, author);
    
    
    }
    
    
    
}
