package cz.tul.vlapet.SemestralProject;

/**
 * Class finding the largest palindrome made from the product of two 3-digit numbers. from "https://projecteuler.net/problem=4"
 * Problem 4 Largest palindrome product
 * @author Vladislav Petrushkin
 */
public class Euler extends Semistral {
    /** Checking the number on the palindrome */
    private static boolean isPalindrome(int value) {
        boolean isPalindrome = true;
        String str = Integer.toString(value);
        int len = str.length();
        int index = 0;
        while (isPalindrome && index <= (len-1)/2){
            isPalindrome = str.charAt(index) == str.charAt(len-1-index);
            index++;
        }
        return isPalindrome;
    }

    /** finding two factors */
    protected static void multiplierSearch() {
        int largest = 1;
        String str = "";
        int value;
        for (int i = 999; i >= 100; i--){
            for (int j = i; j >= 100; j--){
                value = i * j;
                if(isPalindrome(value) && largest < value){
                    largest = value;
                    str = i + " x " + j;
                }
            }
        }
    System.out.println("The largest palindrome made from the product of two 3-digit numbers is: " + str + " = " + largest); //output
    }
}
