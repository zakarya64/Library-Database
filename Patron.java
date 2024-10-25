public class Patron
{
    private String name;
    private Book book1;
    private Book book2;
    private Book book3;
    
    public Patron(){
    
    book1 = new Book();
    book2 = new Book();
    book3 = new Book();
    
    
    }
    
    public String getName(){
    
    return name;
    
    }
    
    public void borrowBook(String title, String author){
    
    if(book1 == null) {
    
    book1 = new Book();
    
    
    }
    
    else if(book2 == null) {
    
    book2 = new Book();
    
    
    }
    
    else if(book3 == null) {
    
    book3 = new Book();
    
    
    }
    
    else{
    
        System.out.println("The only books you have out are " + book1 + "," + book2 + ", and " + book3 );
    
    }
    
    
    }
    
    public void displayBorrowedBooks(){
    
    System.out.println(name + book1 + book2 + book3);
    
    }
    
    
}
