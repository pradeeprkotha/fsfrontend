public class Main {
    public static final int j = 7;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!"+j);
        MyRunnable m1 = new MyRunnable();
        MyRunnable m2 = new MyRunnable();
        Thread t1 = new Thread(m1, "t1");
        Thread t2 = new Thread(m2, "t1");
        t2.start();
        t1.start();


        Thread.sleep(1000);

    }
}