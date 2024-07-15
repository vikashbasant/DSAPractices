package main;

public class ReplaceAllDigit {


    public static String replaceDigits(String s) {

        char[] charArray = s.toCharArray();

        for(int i=1; i<charArray.length; i+=2) {
            charArray[i] = (char) (charArray[i-1] + charArray[i]-'0');
        }

        return String.valueOf(charArray);
    }


    public static void main(String[] args) {
        String str = "a1c1e1";
        String s = replaceDigits(str);
        System.out.println(s);
    }
}
