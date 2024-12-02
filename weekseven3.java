public class weekseven3 extends Thread {
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            // checking for daemon thread
            System.out.println("daemon thread work");
        } else {
            System.out.println("user thread work");
        }
    }

    public static void main(String[] args) {
        weekseven3 t1 = new weekseven3();// creating thread
        weekseven3 t2 = new weekseven3();
        weekseven3 t3 = new weekseven3();

        t1.setDaemon(true);// now t1 is daemon thread

        t1.start();// starting threads
        t2.start();
        t3.start();
    }

}
