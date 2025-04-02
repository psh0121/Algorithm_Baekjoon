import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 삼각형: 두변의 합 > 나머지 한변
        // 직각삼각형: a^2 + b^2 = c^2
        // 예각삼각형: a^2 + b^2 > c^2
        // 둔각삼각형: a^2 + b^2 < c^2

        int res1 = 0;
        int res2 = 0;
        int res3 = 0;
        int res4 = 0;

        while (true) {
            String[] temp = sc.nextLine().split(" ");
            int[] arr = {
                Integer.parseInt(temp[0]),
                Integer.parseInt(temp[1]),
                Integer.parseInt(temp[2])
            };
            Arrays.sort(arr);

            int a = arr[0];
            int b = arr[1];
            int c = arr[2];

            if(a + b <= c) break;

            res1++;

            if(a*a + b*b == c*c) res2++;
            else if(a*a + b*b > c*c) res3++;
            else if(a*a + b*b < c*c) res4++;
        }

        System.out.println(res1 + " " + res2 + " " + res3 + " " + res4);
        sc.close();
    }
}