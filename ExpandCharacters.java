package assignment1;

import java.util.Scanner;

public class ExpandCharacters {

        public static String expand_character(String s1) {
            String output = "";

            for (int i = 0; i < s1.length(); i++) {
                char c1 = s1.charAt(i);
                if (Character.isLetter(c1) && i + 1 < s1.length() && Character.isDigit(s1.charAt(i + 1))) {
                    int num1 = Character.getNumericValue(s1.charAt(i + 1));

                    for (int j = 0; j < num1; j++) {
                        output = output + c1;
                    }
                }
            }

            return output;
        }
        public static void main(String[] args) {
            Constant constant = new Constant();
            Scanner sc = new Scanner(System.in);
            while(true){      System.out.println(constant.ENTER_STRING);

            String s1 = sc.next();

            System.out.println(expand_character(s1));
        }




}}
