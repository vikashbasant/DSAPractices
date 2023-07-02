package jvmarchitecutre.classclassobjectdemo;

/**
 * Note: For Every loaded .class file Only One Class Object will be Created, even though we are
 * using Class Multiple Times in Our Application.
 */
public class ClassClassObjectStudentDemo2 {

    public static void main(String[] args) {

        // Create an object of Student class:
        Student st1 = new Student();
        // Getting a class Class object for Student class:
        Class<? extends Student> c1 = st1.getClass();

        // Create an object of Student class:
        Student st2 = new Student();
        // Getting a class Class object for Student class:
        Class<? extends Student> c2 = st2.getClass();


        System.out.println("hashCode c1: " + c1.hashCode()); // 234a234
        System.out.println("hashCode c2: " + c2.hashCode()); // 234a234
        System.out.println("Both hashCode c1 & c2 are equals or not: " + (c1.hashCode() == c2.hashCode())); // true

        /*
            In this example, even those we are using Student class multiple time,
            only one class Class object got created.
        */
    }

}
