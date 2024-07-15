package main;

import java.util.ArrayList;


class Gen<T> {

    private T ob;

    Gen() {
        // Default Constructor:
    }

    Gen(T ob) {
        this.ob = ob;
    }

    public void show() {
        System.out.println("The type of ob: " + this.ob.getClass().getName());
    }

    public T getOb() {
        return this.ob;
    }

}


public class GenericJava {


    public static void main(String[] args) {

        Gen<String> gen = new Gen<>("Vikash");
        gen.show();
        System.out.println(gen.getOb());


    }

}
