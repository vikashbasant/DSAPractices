package jvmarchitecutre.classclassobjectdemo;

import java.lang.reflect.Method;

/**
 * Program to print methods information by using a Class object of String class:
 */
public class ClassClassObjectStringDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        // create classClass Object of String class:
        Class<?> aClass = Class.forName("java.lang.String");

        int countMethods = 0;

        // Find all the methods of a classClass object:
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
            countMethods++;
        }
        System.out.println("Total Number of declared method in String class: " + countMethods);
    }
}
