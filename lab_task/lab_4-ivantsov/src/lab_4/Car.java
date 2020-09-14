package lab_4;

public class Car implements  Nameable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Car: "+name);
    }
}
