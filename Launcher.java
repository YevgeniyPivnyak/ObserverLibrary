
public class Launcher {

    public static void main(String[] args) {


        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();

        Journal j1 = new Journal();
        Newspaper n1 = new Newspaper();

        j1.addObserver(s1);
        n1.addObserver(s2);
        j1.addObserver(s3);

        if(j1.newNumberOK()){
            j1.notifyObserver();
        }
        if(n1.newNumberOK()){
            n1.notifyObserver();
        }
    }
}
