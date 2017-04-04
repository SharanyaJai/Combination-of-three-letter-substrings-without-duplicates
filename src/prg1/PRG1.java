/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prg1;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 *
 * @author sharanya
 */
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Class PRG1
 */
public class PRG1 {

    /**
     * Inputs five letter string from user to generate Substrings, Declares a
     * reference variable to an Object of Combinations class and calls the
     * testForSubString method
     *
     * @param args
     * @throws IOException
     */
       int singleNumber(int A[], int n) {
        int count[32] = {0};
        int result = 0;
        for (int i = 0; i < 32; i++) {
            for (int j = 0; j < n; j++) {
                if ((A[j] >> i) & 1) {
                    count[i]++;
                }
            }
            result |= ((count[i] % 3) << i);
        }
        return result;
    }

    public static void main(String[] args) throws IOException {

        Combinations c = new Combinations();// Declaring an object of Combinations class
        System.out.println("Please enter a five letter word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while (str.length() != 5) {
            System.out.println("Please enter a five letter word");
            str = sc.nextLine();
        }
        c.testForSubString(str);

    }
}
