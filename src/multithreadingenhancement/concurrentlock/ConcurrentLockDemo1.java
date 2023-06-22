package multithreadingenhancement.concurrentlock;

class Display {
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

public class ConcurrentLockDemo1 {
    public static void main(String[] args) {
        Display d = new Display();
        d.wish("Dhoni");
    }
}
