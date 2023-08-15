package hackerrank;

//Q-1 Write a program in Java to display prime no between 2 to 100.
// Q-1 Write a program to find frequency of each element in ArrayArr[]={1,2,8,3,2,2,2,5,1}

/*
* Write a program in Java to use Inheritance
create a class Employee
Member Variable : name=’Java P’ and salary=50000.
Member Method:Display_emp() To display value of member variable of Employee class.
create a class Programmer
Member Variable : department=’IT’ and bonus=3000.
Member Method: Display_programmer() To display value of member variable of Programmer class.
Do inherit Employee class in Programmer class. Create object of Programmer class & print value of name, salary, department
	* */
public class Exam {


    public static int[] frequenceyoutube(int[] arr) {
        int[] result = new int[50];
        for (int i : arr) {
            result[i] += 1;
        }
        return result;

    }

    public static boolean isPrime(int num) {
        for (int div = 2; div < num; div++) {
            if (num % div == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        for (int i = 2; i <= 100; i++) {
//            // Check Prime:
//
//            boolean result = isPrime(i);
//            if (result) {
//                System.out.print(i + " ");
//            }
//
//        }

        int[] arr = {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] result = frequenceyoutube(arr);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(i + "= " + result[i]);
            }
        }
    }
}
