import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(arr);

            int cnt1 = 0;   // 직각 a^2 + b^2 = c^2
            int cnt2 = 0;   // 예각 a^2 + b^2 > c^2
            int cnt3 = 0;   // 둔각 a^2 + b^2 < c^2

            for(int a = 0; a < 4; a++) {
                for(int b = a+1; b < 4; b++) {
                    for(int c = b+1; c < 4; c++) {
                        // 삼각형 조건이 성립하는가? a + b > c
                        if(arr[a] + arr[b] <= arr[c]) continue;

                        if(arr[a]*arr[a] + arr[b]*arr[b] == arr[c]*arr[c]) cnt1++;
                        else if(arr[a]*arr[a] + arr[b]*arr[b] > arr[c]*arr[c]) cnt2++;
                        else cnt3++;
                    }
                }
            }

            System.out.println(cnt1 + " " + cnt2 + " " + cnt3);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
