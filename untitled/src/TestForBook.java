public class TestForBook {
    Book book;
    TestForBook(Book book)
    {
        this.book = book;
    }

    public boolean test()
    {
        return true;
    }

    public String toString()
    {
        return book.toString();
    }
}
