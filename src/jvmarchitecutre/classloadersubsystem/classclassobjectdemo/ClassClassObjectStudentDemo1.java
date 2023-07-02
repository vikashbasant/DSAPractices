package jvmarchitecutre.classclassobjectdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Program to print methods and variables information by using a Class object
 */
public class ClassClassObjectStudentDemo1 {
    public static void main(String[] args) {

        Class<Student> aClass = Student.class;

        // Find the class Name of a classClass object:
        String name = aClass.getName();
        System.out.println("Class Name: " + name);
        
        System.out.println("=========================================================================================");

        // Find all the methods of a classClass object:
        int countMethod = 0;
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declareMethod : declaredMethods) {
            countMethod++;
            System.out.println(declareMethod);
        }
        System.out.println("Total Number of method present in classClass object is: " + countMethod);

        System.out.println("=========================================================================================");

        /// Find all the fields of a classClass object:
        int countVariable = 0;
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            countVariable++;
            System.out.println(declaredField);
        }
        System.out.println("Total Number of Varaibale presnet in the classClass Object: " + countVariable);

    }
}
