package collections;


import java.util.Scanner;

public class TotalString {

    private static String sumOfTwoString(String s1, String s2) {

        String total = "";
        int carry = 0;
        int si = s1.length()-1;
        int sj = s2.length()-1;

        while(si>=0 && sj >=0){
            int sInt = s1.charAt(si)-'0';
            int sInt1 = s2.charAt(sj)-'0';

            int temp = (sInt + sInt1 + carry);

            total = (temp%10) + total;
            carry = temp/10;
            si--;
            sj--;
        }

        while (si >= 0) {
            int sInt = s1.charAt(si)-'0';
            int temp = sInt+carry;
            total = (temp%10) + total;
            carry = temp/10;
            si--;
        }

        while (sj >= 0) {
            int sInt1 = s2.charAt(sj)-'0';

            int temp = (sInt1 + carry);

            total = (temp%10) + total;
            carry = temp/10;
            sj--;
        }

        if(carry != 0) {
            total += carry;
        }

        return total;
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String result = sumOfTwoString(s1, s2);
        System.out.println("result: " + result);
    }
}
