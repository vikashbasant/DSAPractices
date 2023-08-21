package hackerrank;

import java.util.Scanner;

public class FindSmallestLetterGreaterThanTarget {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        char[] letters = new char[size];

        for(int i = 0; i < size; i++) {
            letters[i] = scan.next().charAt(0);
        }


        char target = scan.next().charAt(0);

        System.out.println(findSmallestLetterGreaterThanTarget(letters, target));

        scan.close();
    }

    public static char findSmallestLetterGreaterThanTarget(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;
        char possibleAnswer = letters[0]; // Initialize with the first character

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                possibleAnswer = letters[mid];
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return possibleAnswer;
    }
}
