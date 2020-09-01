public class TestForDog {
    Dog dog;
    TestForDog(Dog dog){
        this.dog = dog;
    }

    public boolean test()
    {
        return true;
    }

    public String toString()
    {
        return dog.toString();
    }
}
