package java8.thread;

public class ThreadUsingRunnable implements Runnable{
    private String name;
    public ThreadUsingRunnable(String name) {
        this.name = name;
    }
    public void printName() {
        System.out.println("Hi "+name);
    }
    @Override
    public void run() {
        printName();
    }

    public static void main(String []args) {
        ThreadUsingRunnable rn = new ThreadUsingRunnable("Ijhar ansari");
        Thread thread1 = new Thread(rn);
        thread1.start();

        ThreadUsingRunnable rn1 = new ThreadUsingRunnable("Tabrez ansari");
        Thread thread2 = new Thread(rn1);
        thread2.start();
    }
}
