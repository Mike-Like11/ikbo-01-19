package pract_2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Mike I", "miki_mouse@gmail.ru", 'M');
        System.out.println(a);
        a.setEmail("likelike@yandex.ru");
        System.out.println(a.getGender());
    }
}
