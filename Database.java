import java.util.ArrayList;
/**
 * This class simulates a Database
 * 
 * There is a single, public method that your
 * program will use
 * public Patron getPatron(int n)
 * getPatron(1) will return the entire object for Mr. Sclavos
 * 
 * 
 */
public class Database
{
    public Patron getPatron(int n)
    {
        return people.get(n-1);
    }
    
    /////////////////////////DO NOT MODIFY/////////////////
    //////////////////////ANY CODE UNDER THIS//////////////
    
    private ArrayList<Patron> people;
    public Database()
    {
       people = new ArrayList<Patron>();
       addPatrons();
       setBooks();
    }
    
    private void addPatrons()
    {
       people.add(new Patron("Mr. Sclavos"));
       people.add(new Patron("Ms. Billy"));
       people.add(new Patron("Mr. Grunin"));
       people.add(new Patron("Mr. Hughes"));
       people.add(new Patron("Mr. Gwinn"));
       people.add(new Patron("Ms. Stern"));
       people.add(new Patron("Mr. Dilfanian"));
       people.add(new Patron("Ms. Ward"));
       people.add(new Patron("Ms. Vassallo"));
       people.add(new Patron("Ms. Shaker"));
    }
    
    private void setBooks()
    {
       people.get(0).borrowBook("Java: The Complete Reference", "Herbert Schildt");
       people.get(0).borrowBook("Fundamentals of Java", "Lambert and Osborne");
       people.get(0).borrowBook("Java Methods", "Anna Litvin");
       people.get(1).borrowBook("1984", "George Orwell");
       people.get(1).borrowBook("Odyssey", "Homer"); 
       people.get(4).borrowBook("A Game of Thrones", "George R. Martin");
       people.get(7).borrowBook("Don Quixote", "Miguel de Cervantes");
       
    }
    


}
