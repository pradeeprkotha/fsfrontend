public class MyRunnable implements Runnable{
    private int counter;

    @Override
    public void run() {
        long start = System.nanoTime();
        for(int i=0;i<2_000_000;i++){
//            synchronized(this){
                counter++;
//            }
        }
        long elap = System.nanoTime() -start;
        System.out.println(Thread.currentThread().getName() + "counter "+counter+ " Time "+elap/1000000 +" ms");
    }
    public int getCount() {
        return counter;
    }
}
