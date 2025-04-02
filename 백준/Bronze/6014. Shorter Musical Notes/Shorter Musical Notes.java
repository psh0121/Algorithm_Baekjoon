import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] s = new int[n+1];
        int[] e = new int[n+1];

        for(int i = 1; i < n+1; i++) {
            int time = sc.nextInt();

            if(i == 1) {
                e[i] = s[i] + (time-1);
            }
            else {
                s[i] = e[i-1] + 1;
                e[i] = s[i] + (time-1);
            }
        }

        while (q-- > 0) {
            int value = sc.nextInt();

            for(int i = 1; i < n+1; i++) {
                int start = s[i];
                int end = e[i];

                if(value >= start && value <= end) {
                    System.out.println(i);
                    break;
                }
            }
        }
        sc.close();
    }
}