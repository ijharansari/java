package java8.thread;

/**
 * Get the name of thread which is currently executing
 */
public class Thread1 implements Runnable{
    private String name;
    private Thread thread;
    private String threadName;

    public Thread1(String name,String threadName) {
        this.name = name;
        this.threadName = threadName;
    }

    public void getDetails(Thread1 thread1) {
        Thread thread = new Thread(thread1,threadName);
        this.thread = thread;
        thread.start();
    }

    public void printDetails () {
        System.out.println("Hi "+name);
        System.out.println("Thread "+thread.getName()+" is running");
    }
    @Override
    public void run() {
        printDetails();
    }

    public static void main(String []args) {
        Thread1 thread1 = new Thread1("Ijhar ansari","Ijhar");
        thread1.getDetails(thread1);

        Thread1 thread2 = new Thread1("Tabrez ansari","Tabrez");
        thread2.getDetails(thread2);
    }
    
}
