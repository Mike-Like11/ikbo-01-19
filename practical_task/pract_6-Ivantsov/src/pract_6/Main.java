package pract_6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> array = new ArrayList<Student>();
        array.add(new Student(1010, "Zues", 26));
        array.add(new Student(505, "Abey", 24));
        array.add(new Student(809, "Vignesh", 32));
        comparee(array);
        for(Student str: array){
            System.out.println(str);
        }
    }
    public static void  comparee(ArrayList<Student>array){
        Student f;
        for (int left = 0; left < array.size(); left++) {
            // Вытаскиваем значение элемента
            int value = array.get(left).getId();
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array.get(i).getId()) {
                    f=array.get(i+1);
                    array.set(i+1,array.get(i));
                    array.set(i,f);
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            f= array.get(i + 1);
            f.setId(value);
            array.set(i+1,f);
        }
    }
}
