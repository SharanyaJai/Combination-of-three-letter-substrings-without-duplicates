/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Solution {

    public int strStr(String haystack, String needle) {
        boolean ss = false;
        if (needle.length() > haystack.length()) {
            return -1;
        }
        if (needle.length() == 0 || haystack.length() == 0) {
            return 0;
        }

        if (needle.length() == 1 && haystack.length() == 1) {
            if (haystack.charAt(0) == needle.charAt(0)) {
                return 0;
            }
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            int j = i;
            ss = false;
            if (i + needle.length() <= haystack.length()) {
                int k = 0;

                for (k = 0; j <= i + needle.length() - 1; j++) {

                    if (haystack.charAt(j) != needle.charAt(k)) {
                        ss = false;
                        break;
                    }

                    ss = true;
                    k++;

                }

                if (ss == true) {
                    return i;
                }

            }

        }

        return -1;
    }

}
package prg1;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Class Combinations
 *
 * @author sharanya
 */
public class Combinations {

    ArrayList<String> ar = new ArrayList<String>();

    /**
     * Builds three letter substrings from the string parameter passed Tests for
     * duplicates and prints the substrings without duplicates
     *
     * @param str
     * @throws IOException
     */
    public void testForSubString(String str) throws IOException {

        System.out.println("Possible 3 letter substrings without duplicates:\n");
        for (int i = 0; i < str.length(); i++) {             // position of 1st letter
            for (int j = 0; j < str.length(); j++) {         // position of 2nd letter
                for (int k = 0; k < str.length(); k++) {     // positon of 3rd letter
                    if (i == j || i == k || j == k) {
                        continue;  // skips a letter taken twice or more number of times
                    }
                    {
                        String s = new StringBuilder().append(str.charAt(i)).append(str.charAt(j)).append(str.charAt(k)).toString();//builds substrings

                        if (!ar.contains(s)) {// tests for duplicacy

                            System.out.println(s);
                            ar.add(s); // adds substrings to the array list
                        }

                    }
                }
            }
        }
    }

}
