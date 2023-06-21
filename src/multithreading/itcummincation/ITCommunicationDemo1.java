package multithreading.itcummincation;

class ThreadA extends Thread {
    int totals = 0;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            totals += i;
        }
    }
}

public class ITCommunicationDemo1 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.start();

        System.out.println(a.totals);

        /*
         * Possible the output:
         * 0
         * 5050
         * 0<= x <= 5050
         * */
    }


}
