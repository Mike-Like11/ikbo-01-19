package pract_10;

public class FunctionalChair implements Chair {
    int sum(int a,int b){
        return a+b;
    }

    @Override
    public String toString() {
        return "FunctionalChair{}";
    }
}
