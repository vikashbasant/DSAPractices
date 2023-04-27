package flowcontrol.foreachloop;

public class ExForEachLoop2 {

    private static void printArrays(int[][][] arr) {
        for (int[][] arr1 : arr) {
            for (int[] arr2 : arr1) {
                for (int element : arr2) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][][] array = {{{1,2,3,4}, {3, 4}},{{1,2,3},{1,2}}};
        printArrays(array);
    }
}
