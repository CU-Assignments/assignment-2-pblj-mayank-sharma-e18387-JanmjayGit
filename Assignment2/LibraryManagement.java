// Base class
class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}


public class LibraryManagement {
    public static void main(String[] args) {
       
        Fiction book1 = new Fiction("Harry Potter", "J.K. Rowling", 500);

        NonFiction book2 = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

    
        book1.displayDetails();
        book2.displayDetails();
    }
}
