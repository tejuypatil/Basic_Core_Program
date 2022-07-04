package Com.bridgelabz.basic.core;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter alphabet:");
        Scanner c= new Scanner(System.in);
        char character = c.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            System.out.println(character + " is vowel");
        }
        else {
            System.out.println(character+ " is consonant");
        }
        
    }
}
