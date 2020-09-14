package lab_4;

public class Person implements Nameable {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void getName() {
        System.out.println("Person: "+name);
    }
}
