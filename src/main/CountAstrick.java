package main;

public class CountAstrick {
    public static int countAsterisks(String s) {

        int count = 0;
        boolean isSlash = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '|') {
                isSlash = isSlash == false? true : false;
            } else if (ch == '*' && isSlash != true) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "iamprogrammer";

        int result = countAsterisks(str);
        System.out.println(result);
    }
}
