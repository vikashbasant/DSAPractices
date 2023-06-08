package test;

/*

The time and space complexity of the provided code can be analyzed as follows:

Time Complexity:

The findNegativeNo method performs a binary search on each array in the input matrix.
The binary search has a time complexity of O(log N), where N is the length of the array.


The countNegatives method iterates over each array in the input matrix and calls the findNegativeNo method,
which has a time complexity of O(log N) for each array.

Therefore, the overall time complexity of the code is O(M * log N),
where M is the number of arrays in the matrix and N is the average length of the arrays.
Space Complexity:

The space complexity of the code is O(1)
since it uses a constant amount of additional space. T
he space required does not depend on the size of the input matrix or the length of the arrays.


Overall, the time complexity is O(M * log N), and the space complexity is O(1).
 */
public class NegativeNo {

    public static int findNegativeNo(int[] arr) {

        // find the start index:
        int startIndex = 0;
        int endIndex = arr.length - 1;

        // track the index where starting negative number from the array:
        int index = -1;

        while (startIndex <= endIndex) {

            // find the midIndex from the array:
            int mid = (startIndex + endIndex) / 2;

            // Check weather arr[mid] is negative number or not:
            if (arr[mid] < 0) {

                // If the array mid-index number is negative number:
                // then this is one possible answer for the question:
                index = mid;

                // Now check the all possibility of the negative number from the array on the left side:
                endIndex = mid - 1;

            } else {
                // If arr[mid] is not negative number that means check on the right side of the array:
                startIndex = mid + 1;
            }

        }
        // simply return the index from where the negative number is started:
        return index;
    }

    public static void main(String[] args) {

        int[][] arr = {{3, 2}, {1, 2}};
        int i = countNegatives(arr);
        System.out.println(i);
    }

    public static int countNegatives(int[][] grids) {

        // track the negative number from each array:
        int count = 0;

        // iterate over the matrix:
        for (int[] grid : grids) {

            // find the index where negative number is started:
            int index = findNegativeNo(grid);

            // if index == -1, that means there no any place inside the array where negative is started:
            if (index != -1) {
                // simply subtract the grid.length - index(of the negative number)
                count += grid.length - index;
            }

        }
        // simply return the count of the negative number present inside the matrix:
        return count;

    }

}
