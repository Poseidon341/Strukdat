package Kegiatan1modul3;

import java.util.Stack;

public class Kegiatan1modul3 {
    public static void main(String[] args) {
        String inputString = "Hello World";
        String reversedString = reverseString(inputString);
        System.out.println(reversedString);
    }

    public static String reverseString(String string) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
}