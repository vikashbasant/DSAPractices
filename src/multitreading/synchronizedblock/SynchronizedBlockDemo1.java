package multitreading.synchronizedblock;

class Display1 {
    public void wishes(String name) {

        /* ===1 lakhs line of code:=== */

        // To Get The Lock Of the Current Object:
        synchronized (this) {
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

class MyThread1 extends Thread {

    // instance variable of MyThread:
    Display1 d;
    String name;

    //Parameterized Constructor:
    public MyThread1(Display1 d, String name) {
        this.d = d;
        this.name = name;
    }

    // Override the run() method from Thread Class:
    @Override
    public void run() {
        d.wishes(this.name);
    }
}

public class SynchronizedBlockDemo1 {
    public static void main(String[] args) {

        Display1 d = new Display1();
        Display1 d1 = new Display1();

        MyThread1 t = new MyThread1(d, "Dhoni");
        MyThread1 t1 = new MyThread1(d1, "Youvraj");

        t.start();
        t1.start();
    }
}
