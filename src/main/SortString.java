package main;

import java.util.Arrays;

public class SortString {


    public static String sortVowels(String s) {


        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                arr[i] = ch - 'A' + 65;
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                arr[i] = ch - 'a' + 97;
            }


        }

        Arrays.sort(arr);

        String str = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        str = str + (char) (arr[j]);
                        arr[j] = 0;
                        break;
                    }
                }
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] != 0) {
                        str = str + (char) (arr[j]);
                        arr[j] = 0;
                        break;
                    }
                }
            } else {
                str += ch;
            }


        }

        return str;
    }


    public static void main(String[] args) {
        String str = "lYmpH";

        System.out.println(sortVowels(str));
    }

}
