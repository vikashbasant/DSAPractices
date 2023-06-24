package innerclasses.anonymousinnerclasses;


// Anonymous Inner Class that define inside method arguments:
// =>> Anonymous Inner Class Approach: <<=
public class AnonymousInnerClassDemo7 {
    public static void main(String[] args) {
        // Implementing run() method of Runnable Interface:
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread!");
            }
        }).start();


        // this block of code execute by main thread:
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread!");
        }

    }
}
