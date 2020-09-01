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
