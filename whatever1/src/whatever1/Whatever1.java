
package whatever1;

import ru.mirea.lab1.Ball;
import ru.mirea.lab1.Book;
import ru.mirea.lab1.Dog;

public class Whatever1 {

    public static void main(String[] args) {
        Ball b = new Ball(10, "Blue");
        Dog dog = new Dog(5, "Gray", "Bulldog");
        Book novel = new Book(500, "The Catcher in The Rye", "J. D. Salinger");
        dog.bark();
    }
    
}
