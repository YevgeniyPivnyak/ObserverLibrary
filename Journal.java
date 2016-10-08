import java.util.Observable;

public class Journal extends Observable{

    Journal(Subscriber... s){
       for(Subscriber elem: s){
           addObserver(elem);

       }
        setChanged();
        notifyObservers();
    }

}
