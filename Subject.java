
public interface Subject {

    public void addObserver (Subscriber s);
//    public void removeObserver (Subscriber s);
    public void notifyObserver ();
}

