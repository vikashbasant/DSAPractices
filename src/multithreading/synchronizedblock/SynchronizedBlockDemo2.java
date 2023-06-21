package multithreading.synchronizedblock;

class Display2 {

    public void wishes(String name) {

        /* ===1 lakhs line of code:=== */

        // To Get the Class Level Lock :
        synchronized (Display2.class) {

            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning: ");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name);
            }

        }

        /* ===1 lakhs line of code:=== */

    }
}

class MyThread2 extends Thread {

    // instance variable:
    Display2 d;
    String name;

    // Parameterized Constructor:
    public MyThread2(Display2 d, String name) {
        this.d = d;
        this.name = name;
    }

    // Override the run() method of Thread Class:
    @Override
    public void run() {
        d.wishes(this.name);
    }
}

public class SynchronizedBlockDemo2 {

    public static void main(String[] args) {

        Display2 d = new Display2();
        Display2 d1 = new Display2();

        MyThread2 t = new MyThread2(d, "Dhoni");
        MyThread2 t1 = new MyThread2(d1, "Youvraj");

        t.start();
        t1.start();

    }
}
