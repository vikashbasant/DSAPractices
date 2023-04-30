package oops.singletoneclass;

/**
 * How to create our own singleton classes?
 * In this approach the required object is created at the begging only whether we are calling getTest() method or not.
 */

class Test {
    private static Test t = new Test();
    
    private Test() {
        
    }
    
    public static Test getTest() {
        return t;
    } 
}
public class ExSingleToneClass {
    public static void main(String[] args) {

        Test t1 = Test.getTest();
        System.out.println(t1);

        Test t2 = Test.getTest();
        System.out.println(t2);

        Test t3 = Test.getTest();
        System.out.println(t3);

        // If we can print each & every object, then we can get same reference number for all the object.
    }
}
