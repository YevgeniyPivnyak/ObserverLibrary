import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{

      @Override
    public void update(Observable o, Object arg) {
        System.out.println(this.toString()+ " notify " + o.toString());
    }
}
