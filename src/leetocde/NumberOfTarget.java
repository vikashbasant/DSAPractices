package leetocde;

import java.util.Scanner;

public class NumberOfTarget {
    public static int findWorksWhichIsGreaterThanTarget(int[] hours, int target) {
        int targetHourMet = 0;

        for(int hour: hours) {
            targetHourMet += hour>=target?1:0;
        }
        return targetHourMet;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] hours = new int[size];
        for (int i = 0; i < size; i++) {
            hours[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();


        int result = findWorksWhichIsGreaterThanTarget(hours, target);
        System.out.println(result);
    }
}
