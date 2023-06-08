package test;

import java.util.Scanner;

public class FahrenheitToCelsius {



    public static float convertToCelsius(float fahrenheit) {
        return  ((fahrenheit - 32) * 5) /9;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float fahrenheit = scan.nextFloat();
        float clesius = convertToCelsius(fahrenheit);
        System.out.println(clesius);
    }

}
