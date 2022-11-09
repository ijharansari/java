package java8.thread;

public class ThreadUsingThread extends Thread {
    public String name;
    public ThreadUsingThread(String name) {
        this.name = name;
    }
    private void printName() {
        System.out.println("Hi "+name);
    }

    @Override
    public void run() {
        printName();
    }

    public static void main(String []args) {
        ThreadUsingThread thread = new ThreadUsingThread("Ijhar ansari");
        thread.start();
        ThreadUsingThread thread1 = new ThreadUsingThread("Tabrez ansari");
        thread1.start();
    }
    
}
