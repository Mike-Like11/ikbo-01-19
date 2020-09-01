package ru.mirea.lab1;

public class Book {
    private String name;
    private String PublishDate;
    private String Author;
    public Book(){
        name = "1984";
        PublishDate = "08.07.1949";
        Author = "George Orwell";
    }
    public String toString(){
        return "Book title: " + name+ " " + "Book publishing date: " + PublishDate + " " + "Book's author: " + Author + " "; 
    }
}
