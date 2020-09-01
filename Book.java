package lab01;

public class Book {
    public String author;
    public String name;
    
    public Book(String a, String n) {
        author = a;
        name = n;
    }
    
    public void ToString() {
        System.out.println(author + ": " + name);
    }
}
