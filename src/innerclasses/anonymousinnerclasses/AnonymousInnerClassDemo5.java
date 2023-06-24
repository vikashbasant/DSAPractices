package innerclasses.anonymousinnerclasses;


// Anonymous Inner Class that define inside method arguments:
// =>> Anonymous Inner Class Approach: <<=
public class AnonymousInnerClassDemo5 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {

            // Implementing run() method of Runnable Interface:
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread!");
                }
            }
        });

        // generate thread and start:
        t.start();

        // this block of code execute by main thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }

    }
}
