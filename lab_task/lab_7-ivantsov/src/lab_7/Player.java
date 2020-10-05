package lab_7;

import java.util.Comparator;

public class Player {
    private String sport,name;
    private int age;

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Player(String sport, String name, int age) {
        this.sport = sport;
        this.name = name;
        this.age = age;
    }
    public int compareTo(Player p) {
        return this.getAge() - p.getAge();
    }

    @Override
    public String toString() {
        return "Player{" +
                "sport='" + sport + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
