package leetcode;

import java.util.Arrays;

//Given two strings s and t , write a function to determine if t is an anagram of s.
//
//Example 1:
//
//Input: s = "anagram", t = "nagaram"
//Output: true
//Example 2:
//
//Input: s = "rat", t = "car"
//Output: false
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return false;
        }
        if (s.length() != t.length()) {
            return false;
        }
        int[] arr = new int[26];
        for (int i = 0; i < s.length() ; i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for (int i: arr) {
            System.out.println(Arrays.toString(arr));
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram v = new ValidAnagram();
        boolean anagram = v.isAnagram("ast", "tap");
        System.out.println(anagram);
    }
}
