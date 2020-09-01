package pkg1para;

public class Ball {
    private String color;
    private int numSize;
    
    Ball (int numSize, String color){
        this.color = color;
        this.numSize = numSize;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public int getSize(){
        return this.numSize;
=======
package lab01;

public class Ball {
    public String firm;
    public String color;
    
    public Ball(String f, String c) {
        firm = f;
        color = c;
    }
    
    public void ToString() {
        System.out.println(color + " ball by " + firm);
    }
}
