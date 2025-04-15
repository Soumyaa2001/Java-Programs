// Create a Book class that has an Author.
// The Author class should have name, email, and gender.
// In Book, include title and price, and a method printBookDetails() that also shows author details.


class Book 
{
	double price = 999.99d;
	String title = "Java Programming";
	Author p = new Author();
	 public  void printBookDetails () {
	  	System.out.println("Nmae is : " + p.name);
	  	System.out.println("Email is : " + p.email);
	  	System.out.println("Gender is : " + p.gender);
	  } 
}

class Author
{
	String name = "James Gosling";
	String email = "jamesgoslin@gmail.com";
	String gender = "male";
}
 
class BookDriver_1
{
	public static void main(String[] args) {
		Book l = new Book();
	System.out.println("Title is : " + l.title);
	System.out.println("Price is : " + l.price + " RS");
	l.printBookDetails();
	}
	
}