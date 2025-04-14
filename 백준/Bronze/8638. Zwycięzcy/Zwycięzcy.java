import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();

        int maxValue = 0;
        String result = "";

        for(int i = 0; i < n; i++) {
            int value = sc.nextInt();

            if(value > maxValue) {
                maxValue = value;
                result = "" + (char)(65+i);
            }
            else if(value == maxValue) {
                result += (char)(65+i);
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
