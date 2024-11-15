import java.util.Arrays;

public class IntegerQs {

    public static int findLargestNumber1(int[] arr) {
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        return largest;
    }

    public static int findLargestNumber2(int[] arr) {
        int largest = arr[0];

        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int reverseInteger(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        int[] numArr = {7,2,8,4,6,2,1};

        System.out.println("Array : " + Arrays.toString(numArr));
        System.out.println("Largest number in the array is " + findLargestNumber1(numArr));
        System.out.println("Largest number in the array is " + findLargestNumber2(numArr));
        System.out.println();

        int num = 1234567;
        System.out.println("Sum of the digits of " + num + " is " + sumOfDigits(num));
        System.out.println();

        System.out.println("Reversed number of " + num + " is " + reverseInteger(num));
        System.out.println();
    }
}
