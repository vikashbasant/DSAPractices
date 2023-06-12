package multitreading.synchronization;

class Display4 {
    public void displayN() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void displayC() {
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

class CustomThread1 extends Thread {
    Display4 d;

    public CustomThread1(Display4 d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.displayN();
    }
}

class CustomThread2 extends Thread {
    Display4 d;

    public CustomThread2(Display4 d) {
        this.d = d;
    }

    @Override
    public void run() {
        d.displayC();
    }
}

public class SynchronizedDemo4 {
    public static void main(String[] args) {

        Display4 d = new Display4();
        CustomThread1 t1 = new CustomThread1(d);
        CustomThread2 t2 = new CustomThread2(d);

        t1.start();
        t2.start();
    }
}
