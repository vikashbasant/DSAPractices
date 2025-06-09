package stream_api;

public class Test {

    private void m1(){
        System.out.println("hello");
    }

//    () -> System.out.println("hello");




    private int sum(int a, int b) {
        return a + b;

    }

//    (a, b) -> System.out.println(a+b);



    private int getLength(String string) {
        return string.length();
    }

//    s -> s.length();

    public static void main(String[] args) {
        Test test = new Test();

        test.m1();
    }
}
