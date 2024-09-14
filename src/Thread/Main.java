package Thread;

public class Main {
    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();
        threadClass.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("I am executed by the main thread");
        }
    }
}