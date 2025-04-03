import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    String bookAuthor;
    double bookPrice;

    public Book(int id, String name, String author, double price) {
        this.bookId = id;
        this.bookName = name;
        this.bookAuthor = author;
        this.bookPrice = price;
    }

    public void printDetails() {
        System.out.println("\nBook ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + bookAuthor);
        System.out.println("Price: ₹" + bookPrice);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[2]; 
        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.print("Enter Book ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Book Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Book Author: ");
            String author = scanner.nextLine();

            System.out.print("Enter Book Price: ");
            double price = scanner.nextDouble();

            books[i] = new Book(id, name, author, price);
        }

        System.out.println();
        System.out.println();
        System.out.println("Book Details");
        for (Book book : books) {
            book.printDetails();
        }
    }
}
