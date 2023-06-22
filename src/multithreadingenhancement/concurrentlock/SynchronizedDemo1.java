package multithreadingenhancement.concurrentlock;

class Display2 {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning! ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
            System.out.println(name);
        }
    }
}

class MyThread2 extends Thread {
    Display2 d;
    String name;

    // Parameterized Constructor:
    MyThread2(Display2 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(this.name);
    }
}

public class SynchronizedDemo1 {
    public static void main(String[] args) {
        Display2 display = new Display2();

        MyThread2 t1 = new MyThread2(display, "Dhoni");
        MyThread2 t2 = new MyThread2(display, "Yuvraj");

        // we are getting regular output:
        t1.start();
        t2.start();

        System.out.println("End Of Main Thread!");
    }
}
