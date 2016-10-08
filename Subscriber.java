
public class Subscriber implements Observer{

    @Override
    public void update(Library library) {
        System.out.println(this.toString()+ " notify "+ library.toString());

    }
}
