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

    public static void main(String[] args) {

        int[] numArr = {7,2,8,4,6,2,1};

        System.out.println("Array : " + Arrays.toString(numArr));
        System.out.println("Largest number in the array is " + findLargestNumber1(numArr));
        System.out.println("Largest number in the array is " + findLargestNumber2(numArr));
    }
}
