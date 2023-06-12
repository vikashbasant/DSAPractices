package multitreading.synchronization;

class Display3 {

    public static synchronized void wish(String name) {

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
}

class MyThread2 extends Thread {

    // This is instance variable of the class MyThread2:
    Display3 d;
    String name;


    // Parametrized Constructor of MyThread2:
    public MyThread2(Display3 d, String name) {
        this.d = d;
        this.name = name;
    }

    // Here we are override the run() method of the Thread class:
    @Override
    public void run() {
        Display3.wish(this.name);
    }
}

public class SynchronizedDemo3 {
    public static void main(String[] args) {


        // Create an object of Display3 class:
        Display3 d = new Display3();
        Display3 d1 = new Display3();


        // Create an object of MyThread2:
        // Here you can see the thread is going to operate over a different-different object(like d, d1).
        // That why we are getting regular output( Because here we are using class level lock):
        MyThread2 t = new MyThread2(d, "Kapil");
        MyThread2 t1 = new MyThread2(d1, "Youvraj");


        // After these four lines of code, there are total 3 threads is present:
        t.start();
        t1.start();
    }
}
