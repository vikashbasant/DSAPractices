package multitreading.synchronization;

class Display5 {

    // displayN() method are synchronized:
    public synchronized void displayN() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // displayC() method are synchronized:
    public synchronized void displayC() {
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class CustomThread3 extends Thread {

    // Instance variable:
    Display5 d;

    // Parameterized Constructor:
    public CustomThread3(Display5 d) {
        this.d = d;
    }

    // Here we are override the run() method of Thread Class:
    @Override
    public void run() {
        d.displayN();
    }
}

class CustomThread4 extends Thread {

    // Instance variable:
    Display5 d;

    // Parameterized Constructor:
    public CustomThread4(Display5 d) {
        this.d = d;
    }

    // Here we are override the run() method of Thread Class:
    @Override
    public void run() {
        d.displayC();
    }
}

public class SynchronizedDemo5 {
    public static void main(String[] args) {

        // Here in this example, Object level lock comes into the picutre:
        // So both threads are execute one by one:
        Display5 d = new Display5();
        CustomThread3 t1 = new CustomThread3(d);
        CustomThread4 t2 = new CustomThread4(d);

        t1.start();
        t2.start();
    }
}
