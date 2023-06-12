package multitreading.mtpt;

class MyThread7 extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println("I am lazy Thread: " + i);
        }

        System.out.println("I'm entered into sleeping stages!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted!");
        }

    }
}

public class ThreadInterruptDemo2 {
    public static void main(String[] args) {
        MyThread7 t = new MyThread7();

        // Here new thread will create:
        // After this line, all line of code execute by Main Thread only.
        t.start();

        // interrupt() method call invoked by main Thread will wait until child Thread entered into sleeping state.
        // Once child thread entered into a sleeping state, then it will be interrupted immediately.
        t.interrupt();

        System.out.println("end of main Thread!");
    }
}
