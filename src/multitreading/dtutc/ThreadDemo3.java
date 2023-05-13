package multitreading.dtutc;

class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("child Thread!");
        }
    }

    public void run(int num) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Overloaded run(int num) which is invoked by explicitly! by programmer(Main Thread).");
        }
    }
}
public class ThreadDemo3 {

    public static void main(String[] args) {

        MyThread3 t = new MyThread3();

        // starting of thread: thread only invoke empty run() method which is override:
        t.start();

        for (int i = 0; i < 2; i++) {
            System.out.println("Main Thread!");
        }

        // It just like normal call to overload run() method. So we can call explicitly.
        t.run(1);


    }
}
