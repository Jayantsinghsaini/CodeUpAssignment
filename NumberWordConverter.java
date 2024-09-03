package assignment1;
import java.util.Scanner;
public class NumberWordConverter {
       public static void number_word_converter(int num){
            String arr1[] = {" ","one","two","three","four",
                           "five","six","seven","eight","nine",
                           "ten","eleven","twelve","thirteen",
                           "fourteen", "fiveteen","sixteen",
                           "seventeen","eighteen","nineteen"};

            String arr2[] = {" "," ","twenty","thirty",
                             "fourty", "fivety","sixty",
                             "seventy","eighty","ninety"};
            String arr = " hundred ";
            int a,b,c,x;
            a=num%10;  //first digit(unit)
            x=num/10;
            b=x%10;    //second digit(tens)
            c=x/10;    //third digit(hundreds)

           if (num < 20) {
               System.out.println(arr1[num]);
           } else if (num < 100) {
               System.out.println(arr2[b] + " " + arr1[a]);
           } else {
               int lastTwoDigits = num % 100;

               if (lastTwoDigits < 20) {
                   System.out.println(arr1[c] + arr + arr1[lastTwoDigits]);
               } else {
                   System.out.println(arr1[c] + arr + arr2[b] + " " + arr1[a]);
               }
           }
        }
        public static void main(String[] args) {
           Constant constant = new Constant();
           Scanner sc = new Scanner(System.in);
           System.out.println(constant.ENTER_NUMBER);

           int num = sc.nextInt();

           number_word_converter(num);

        }}

