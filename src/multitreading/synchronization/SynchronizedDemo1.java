package multitreading.synchronization;

class Display1 {


// Here this method is a synchronized method.
// So that every time only one thread is allowed to operate.
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

class MyThread extends Thread {

// This is instance variable of the class MyThread:
Display1 d;
String name;


// Parametrized Constructor of MyThread:
public MyThread(Display1 d, String name) {
	this.d = d;
	this.name = name;
}

// Here we are override the run() method of the Thread class:
@Override
public void run() {
	d.wish(this.name);
}
}

public class SynchronizedDemo1 {

public static void main(String[] args) {
	
	// Create an object of Display1 class:
	Display1 display = new Display1();
	
	// Create an object of MyThread:
	MyThread t = new MyThread(display, "Dhoni");
	MyThread t1 = new MyThread(display, "Youvraj");
	MyThread t2 = new MyThread(display, "Raina");
	MyThread t3 = new MyThread(display, "Kholi");
	
	// After these four lines of code, there are total 5 threads is present:
	t.start();
	t1.start();
	t2.start();
	t3.start();
	
}
}
