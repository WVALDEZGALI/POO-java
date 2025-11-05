package H_OOP;

public class Book {

    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void Library(){
        System.out.println("This book has the title" + title + " ,and its author is " + author);
    }
}


