package assignment1;
import java.util.Scanner;
public class PrimeNumber {
    public static boolean prime_number(int num){
            int count =0;
            for (int i = 2; i <= num; i++) {
                if (num%i==0){
                    count++;
                }
            }
            if(count==1){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            Constant constant = new Constant();
            Scanner sc = new Scanner(System.in);
            System.out.println(constant.ENTER_NUMBER);

            int num = sc.nextInt();

            System.out.println(prime_number(num));
        }
    }

