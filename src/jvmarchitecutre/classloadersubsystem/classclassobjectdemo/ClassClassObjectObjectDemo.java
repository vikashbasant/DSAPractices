package jvmarchitecutre.classclassobjectdemo;

import java.lang.reflect.Method;

/**
 * Program to print methods information by using a Class object of Object class:
 */
public class ClassClassObjectObjectDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        // create classClass Object of Object class:
        Class<?> aClass = Class.forName("java.lang.Object");

        int countMethods = 0;

        // Find all the methods of a classClass object:
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
            countMethods++;
        }
        System.out.println("Total Number of declared method in Object class: " + countMethods);

    }
}
