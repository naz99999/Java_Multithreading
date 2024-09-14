package Runnable;

public class MainRunnable {
    public static void main(String[] args) {

        RunnableThread runnable = new RunnableThread();
        Thread runnableThread = new Thread(runnable);
        //runnableThread.setDaemon(true);
        runnableThread.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("I am executed by the main thread");
        }
    }
}
