public class SubClass implements Factory{
    @Override
    public Object getObject() {
        return new User();
    }
}
