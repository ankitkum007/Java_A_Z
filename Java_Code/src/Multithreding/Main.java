package Multithreding;

public class Main {
    public static void main(String[] args) {
        ThreadActivity t1 = new ThreadActivity();
        ThreadActivity t2 = new ThreadActivity();
        ThreadActivity t3 = new ThreadActivity();

        t1.setName("ADD");
        t2.setName("CHAR");
        t3.setName("NUM");

        t1.start();
        t2.start();
        t3.start();
    }
}
