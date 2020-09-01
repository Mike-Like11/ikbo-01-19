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

