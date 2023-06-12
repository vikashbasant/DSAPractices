package multitreading.synchronization;

class Display2 {

  // Even though we declared wish() method as synchronized but we will get irregular
  // output in this case, because both Threads are operating on different objects.
    public synchronized void wish(String name) {

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

class MyThread1 extends Thread {

    // This is instance variable of the class MyThread:
    Display2 d;
    String name;

    // Parametrized Constructor of MyThread:
    public MyThread1(Display2 d, String name) {
        this.d = d;
        this.name = name;
    }

    // Here we are override the run() method of the Thread class:
    @Override
    public void run() {
        d.wish(this.name);
    }
}

public class SynchronizedDemo2 {

    public static void main(String[] args) {

        // Create an object of Display2 class:
        Display2 d = new Display2();
        Display2 d1 = new Display2();

        // Create an object of MyThread1:
        // Here you can see the thread is going to operate over a different-different object(like d,
        // d1).
        // That why we are getting irregular output:
        MyThread1 t = new MyThread1(d, "Kapil");
        MyThread1 t1 = new MyThread1(d1, "Youvraj");

        // After these four lines of code, there are total 3 threads is present:
        t.start();
        t1.start();

        // Conclusion: If multiple threads are operating on multiple objects then there is no
        // impact of Synchronization.

        // If multiple threads are operating on same java objects then syncronized concept is
        // required(applicable).
    }
}
