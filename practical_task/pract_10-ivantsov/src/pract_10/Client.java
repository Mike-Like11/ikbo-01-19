package pract_10;

public class Client {
    Chair chair;
    void sit(){
        System.out.println("Сижу на "+ chair);
    }
    void setChair(Chair chair){
        this.chair = chair;
    }

}
