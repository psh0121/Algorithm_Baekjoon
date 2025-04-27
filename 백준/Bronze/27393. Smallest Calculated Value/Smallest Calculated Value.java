import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        char[] arr = {'+', '-', '*', '/'};
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = Integer.MAX_VALUE;

        for(int i = 0; i < 4; i++) {
            char cal1 = arr[i];
            int calValue = 0;

            if(cal1 == '+') calValue = a + b;
            else if(cal1 == '-') calValue = a - b;
            else if(cal1 == '*') calValue = a * b;
            else {
                if(b != 0 && a % b == 0) calValue = a / b;
                else continue;
            }

            for(int j = 0; j < 4; j++) {
                char cal2 = arr[j];
                int calValue2 = calValue;
                
                if(cal2 == '+') calValue2 += c;
                else if(cal2 == '-') calValue2 -= c;
                else if(cal2 == '*') calValue2 *= c;
                else {
                    if(c != 0 && calValue2 % c == 0) calValue2 /= c;
                    else continue;
                }

                if(calValue2 >= 0) result = Math.min(result, calValue2);
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
