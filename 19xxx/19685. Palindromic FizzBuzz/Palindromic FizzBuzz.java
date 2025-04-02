import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long e = sc.nextLong();

        for(long i = s; i <= e; i++) {
            String str1 = Long.toString(i);
            String str2 = new StringBuilder(str1).reverse().toString();

            if(str1.equals(str2)) System.out.println("Palindrome!");
            else System.out.println(str1);
        }
        sc.close();
    }
}