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
    }
}
