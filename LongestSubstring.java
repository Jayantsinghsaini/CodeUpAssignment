package assignment1;
import java.util.ArrayList;
import java.util.Scanner;

public class LongestSubstring {

        public static int longest_substring(String s){
            int max = 0;
            ArrayList<Character> list = new ArrayList<>();
            for(int i = 0;i<s.length();i++){
                list.clear();
                for(int j = i;j<s.length();j++){
                    if(list.contains(s.charAt(j))){
                        break;
                    }
                    else{
                        list.add(s.charAt(j));
                    }
                }
                if(list.size()>max){
                    max = list.size();
                }
            }
            return max;
        }
    public static void main(String[] args) {
        Constant constant = new Constant();
        Scanner sc = new Scanner(System.in);
        System.out.println(constant.ENTER_STRING);

        String s1 = sc.next();

        System.out.println(longest_substring(s1));
    }
    }

