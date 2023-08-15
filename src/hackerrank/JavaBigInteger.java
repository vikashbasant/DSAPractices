package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next();
        String num2 = scan.next();

        BigInteger b1 = new BigInteger(num1);
        BigInteger b2 = new BigInteger(num2);

        BigInteger add = b1.add(b2);
        BigInteger multiply = b1.multiply(b2);

        System.out.println(add);
        System.out.println(multiply);
    }
}
