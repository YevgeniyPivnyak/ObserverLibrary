
public class Launcher {

    public static void main(String[] args) {


        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();
        Subscriber s3 = new Subscriber();

        Journal j1 = new Journal(s1, s3);
        Newspaper n1 = new Newspaper(s2);

    }
}
