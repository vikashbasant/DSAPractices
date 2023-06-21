package multithreading.synchronizedblock;


class Display {

    public void wish(String name) {

        /* ===1 lakh line of code:=== */

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

        /* ===1 lakh line of code:=== */


    }

}

class MyThread extends Thread {
    // This is instance variable of the class MyThread:
    Display d;
    String name;


    // Parametrized Constructor of MyThread:
    public MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    // Here we are override the run() method of the Thread class:
    @Override
    public void run() {
        d.wish(this.name);
    }
}

public class SynchronizedBlockDemo {

    public static void main(String[] args) {

        // Create an object of Display1 class:
        Display display = new Display();

        // Create an object of MyThread:
        MyThread t = new MyThread(display, "Dhoni");
        MyThread t1 = new MyThread(display, "Yuvraj");

        t.start();
        t1.start();


    }
}
