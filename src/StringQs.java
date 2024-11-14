import java.util.Arrays;

public class StringQs {

    public static String reverseString1(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }

    public static void reverseString2(String str) {
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0 ; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    public static boolean areAnagrams1(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

//    public static boolean areAnagrams2(String str1, String str2) {}

    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        String str = "hello";

        System.out.println("Reverse String (hello) ==> " + reverseString1(str));
        System.out.print("Reverse String (hello) ==> ");
        reverseString2(str);
        System.out.println();

        String str1 = "silent";
        String str2 = "listen";

        System.out.println("Are silent and listen anagrams ??");
        System.out.println(areAnagrams1(str1, str2));
        System.out.println();

        String str3 = "madam";
        System.out.println("Is madam a palindrome ??");
        System.out.println(isPalindrome(str3));

        String str4 = "Google";
        System.out.println("How many vowels are there in the word Google ??");
        System.out.println(countVowels(str4));

    }
}
