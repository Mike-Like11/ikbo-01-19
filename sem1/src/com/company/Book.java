package com.company;

public class Book {
    private String title;
    private String author_name;
    private  int list;
    public Book(String title, String author_name, int list){
        this.title=title;
        this.author_name=author_name;
        this.list=list;
    }
    public String toString(){
        return "title: " + title +", author's name: " + author_name + ", list: " + list;
    }
}
