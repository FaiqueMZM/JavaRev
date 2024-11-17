import java.util.Arrays;

public class IntegerQs {

    //find the largest number in an integer array using Arrays method
    public static int findLargestNumber1(int[] arr) {
        Arrays.sort(arr);

        int largest = arr[arr.length - 1];
        return largest;
    }

    //find the largest number in an array using for loop while comparing the numbers
    public static int findLargestNumber2(int[] arr) {
        int largest = arr[0];

        for (int num : arr) {       //for each loop to go through each element to compare with the largest
            if (num > largest) {
                largest = num;
            }
        }
        return largest;
    }

    //sum of the digits in a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;      //n is divided by 10 and reminder will be added to the sum
            n /= 10;            //removes the last digit of n
        }
        return sum;
    }

    //reverse the integer
    public static int reverseInteger(int n) {
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;                 //get the last digit of n
            reverse = reverse * 10 + digit;     //add it to the reverse int
            n /= 10;                            //remove the last digit of n
        }
        return reverse;
    }

    //check for prime number
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //count digits in a number
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    //convert a decimal to binary
    public static String decimalToBinary(int n) {
        StringBuilder sb = new StringBuilder(n);
        while (n > 0) {
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        int[] numArr = {7,2,8,4,6,2,1};

        System.out.println("Array : " + Arrays.toString(numArr));
        System.out.println("Largest number in the array is " + findLargestNumber1(numArr));
        System.out.println("Largest number in the array is " + findLargestNumber2(numArr));
        System.out.println();

        int num = 1234;
        System.out.println("Sum of the digits of " + num + " is " + sumOfDigits(num));
        System.out.println();

        System.out.println("Reversed number of " + num + " is " + reverseInteger(num));
        System.out.println();

        int prime = 29;
        System.out.println("Is " + prime + " is a prime number ??");
        System.out.println(isPrime(prime));
        System.out.println();

        int num1 = 5;
        System.out.println("Factorial of " + num1 + " is " + factorial(num1));
        System.out.println();

        int num2 = 12345;
        System.out.println("Count of digits of " + num2 + " is " + countDigits(num2));
        System.out.println();

        int num3 = 5;
        System.out.println("Conversion of  " + num3 + " to binary is => " + decimalToBinary(num3));
    }
}
