package pkg1para;

public class Dog {
    private int age;
    private String name;
    
    Dog(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
}
