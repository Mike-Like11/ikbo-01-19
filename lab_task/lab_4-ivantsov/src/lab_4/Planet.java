package lab_4;

public class Planet implements Nameable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Planet() {
    }

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Planet: "+name);
    }
}
