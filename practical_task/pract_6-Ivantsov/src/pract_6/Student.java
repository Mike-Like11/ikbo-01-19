package pract_6;

import java.util.ArrayList;

public class Student {
    private int id, kurs;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", kurs=" + kurs +
                ", name='" + name + '\'' +
                '}';
    }

    private String name;

    public Student(int id,  String name,int kurs) {
        this.id = id;
        this.kurs = kurs;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void compare(ArrayList<Student> array) {
        for (int left = 0; left < array.size(); left++) {
            // Вытаскиваем значение элемента
            int value = array.get(left).id;
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array.get(i).id) {
                    array.get(i + 1).id = array.get(i).id;
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array.get(i + 1).id = value;
        }
    }
}
