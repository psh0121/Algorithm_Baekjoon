import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            int curValue = 0;
            for(int j = 0; j < n/2; j++) {
                if(s.charAt(j) != s.charAt(n - j - 1)) curValue++;
            }

            int value = Math.abs(k - curValue);

            System.out.println("Case #" + i + ": " + value);
        }
        sc.close();
    }
}