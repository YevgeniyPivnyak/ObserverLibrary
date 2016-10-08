
import java.util.ArrayList;
import java.util.List;

public abstract class Library implements Subject {

    private List<Subscriber> subscribers;
    boolean newNumber;

    public void setNewNumber(boolean newNumber) {
        this.newNumber = newNumber;
    }

    public Library() {
        subscribers = new ArrayList<Subscriber>();
    }

    public boolean newNumberOK() {
        return newNumber;
    }

    @Override
    public void addObserver(Subscriber s) {
        subscribers.add(s);
    }

//    @Override
//    public void removeObserver(Observer s) {
//        subscribers.remove(s);
//    }

    @Override
    public void notifyObserver() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }

    }
}
