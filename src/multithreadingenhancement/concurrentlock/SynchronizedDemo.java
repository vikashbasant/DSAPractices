package multithreadingenhancement.concurrentlock;

class Display1 {
    public void wish(String name) {
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

class MyThread extends Thread {
    Display1 d;
    String name;

    // Parameterized Constructor:
    MyThread(Display1 d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(this.name);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        Display1 display = new Display1();

        MyThread t1 = new MyThread(display, "Dhoni");
        MyThread t2 = new MyThread(display, "Yuvraj");

        // we are getting irregular output:
        t1.start();
        t2.start();

        System.out.println("End Of Main Thread!");
    }
}
