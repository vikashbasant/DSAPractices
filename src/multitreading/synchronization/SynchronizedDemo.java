package multitreading.synchronization;

class Display {

    public void wish(String name) {
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

public class SynchronizedDemo {

    public static void main(String[] args) {
        Display display = new Display();
        display.wish("Dhoni");
    }
}
