
class Book {
    String bookName;
    double bookPrice;
    String bookAuthor;
    int bookQuantity;
    int yearOfPublish;

    Book()
    {

    }

    Book(String bookName)
    {
        this.bookName=bookName;
    }
    Book(String bookName, double bookPrice)
    {
        this(bookName);
        this.bookPrice=bookPrice;
    }
    Book(String bookName, double bookPrice, String bookAuthor)
    {
        this(bookName, bookPrice);
        this.bookAuthor=bookAuthor;
    }

    Book(String bookName, double bookPrice, int bookQuantity)
    {
        this(bookName, bookPrice);
        this.bookQuantity=bookQuantity;
    }
    Book(String bookName, double bookPrice, String bookAuthor, int bookQuantity)
    {
        this(bookName, bookPrice, bookAuthor);
        this.bookQuantity=bookQuantity;
    }

    public void displayBookDetails() {
    	System.out.println();
        System.out.println("Book Name: " + bookName);
        System.out.println("Price: " + bookPrice + " RS");
        System.out.println("Author: " + bookAuthor);
        System.out.println("Quantity: " + bookQuantity);
        System.out.println("Year Of Publish: " +yearOfPublish);

    }

    }

    class BookDriver{
    	
    public static void main(String[] args) {

    	Book b1 = new Book();  
        Book b2 = new Book("Java Programming");  
        Book b3 = new Book("Java Programming", 499.99);  
        Book b4 = new Book("Java Programming", 499.99, "James Gosling");  
        Book b5 = new Book("Java Programming", 499.99, 10);  
        Book b6 = new Book("Java Programming", 499.99, "James Gosling", 10);  

    	b1.displayBookDetails();
        b2.displayBookDetails();
        b3.displayBookDetails();
        b4.displayBookDetails();
        b5.displayBookDetails();
        b6.displayBookDetails();

        
    }
}
