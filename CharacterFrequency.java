package assignment1;
import java.util.Scanner;

public class CharacterFrequency {
    public static String character_frequency(String s1) {
            s1= s1+" ";
            String result = "";
            int count = 1;

            for (int i = 1; i < s1.length(); i++) {
                if (s1.charAt(i) == s1.charAt(i - 1)) {
                    count++;
                }
                else {
                    result =  result + (s1.charAt(i - 1) + String.valueOf(count));
                    count = 1;
                }
            }
            return result;
    }

        public static void main(String[] args) {
            Constant constant = new Constant();
            Scanner sc = new Scanner(System.in);
            System.out.println(constant.ENTER_STRING);

            String s1 =sc.next();

            System.out.println(character_frequency(s1));
        }
    }


