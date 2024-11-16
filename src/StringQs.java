import java.util.Arrays;
import java.util.HashSet;

public class StringQs {

    //reverse the string using StringBuilder method
    public static String reverseString1(String str) {
        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }

    //reverse a string by storing it in a char array and printing it in reverse
    public static void reverseString2(String str) {
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0 ; i--) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }

    //check if the two strings are anagram by storing them in a char array and using Arrays.sort() method
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

    //check if the string is palindrome using StringBuilder method
    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }

    //count the vowels in the given string using for each loop
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) { //convert the string to char array and go through each element
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    //count occurrence of a character in a string
    public static int countOccurrence(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }

    //remove duplicate character in the given string
    public static String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
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
        System.out.println();

        System.out.println("How many occurrences of 'o' are there in the word " + str4 + " ??");
        System.out.println(countOccurrence(str4, 'o'));
        System.out.println();

        String str5 = "monopolis";
        System.out.println("Remove duplicate character from the word " + str5 + " ==> " + removeDuplicates(str5));

    }
}
