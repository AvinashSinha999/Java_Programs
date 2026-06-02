/*
    Abstraction: A class that cannot be created directly using abstract keyword.
                 Forces child classes to implement abstract methods.
*/

package J06_OOPs_Programs_Abstraction;

//------------------------------ MAIN CLASS ------------------------------

public class AB03_T_Program {
    public static void main(String[] args) {

        Book myBook = new PrintMyBook("Harry Potter", "J.K. Rowling", "120");
        myBook.getDetails();

    }
}

//------------------------------ PARENT CLASS ------------------------------

abstract class Book {

    String name;
    String author;
    String price;

    public Book(String name_c, String author_c, String price_c) {

        this.name = name_c;
        this.author = author_c;
        this.price = price_c;

    }

    abstract void getDetails();
}

//------------------------------ CHILD CLASS ------------------------------

 class PrintMyBook extends Book {

    public PrintMyBook(String name, String author, String price) {
        super(name, author, price);
    }

    @Override
    void getDetails() {
        System.out.println(name + ", " + author + ", " + price);
    }

}