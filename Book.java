package pkg1para;

public class Book {
    private int page;
    private String name;
    
    Book (int page, String name){
        this.page = page;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    public int getPage(){
        return this.page;
    }
}

=======
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