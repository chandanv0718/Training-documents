package org.example;


public class Demo03_StringUtils {

    public static boolean isPalindrome(String candidate) {

        String reverse = new StringBuilder(candidate)
                .reverse()
                .toString();

        return candidate.equals(reverse);
    }
}
