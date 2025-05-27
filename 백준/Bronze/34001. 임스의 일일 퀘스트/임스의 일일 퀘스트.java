import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int[][] arr1 = {
            {220, 210, 200},
            {225, 220, 210},
            {230, 225, 220},
            {235, 230, 225},
            {245, 235, 230},
            {250, 245, 235}
        };
        int[][] arr2 = {
            {270, 265, 260},
            {275, 270, 265},
            {280, 275, 270},
            {285, 280, 275},
            {290, 285, 280},
            {295, 290, 285},
            {300, 295, 290}
        };

        int l = sc.nextInt();

        int[] result1 = new int[6];
        int[] result2 = new int[7];

        for(int i = 0; i < 6; i++) {
            int cnt = 0;

            for(int j = 0; j < 3; j++) {
                if(l >= arr1[i][j]) {
                    if(j == 0) cnt = 100;
                    else if(j == 1) cnt = 300;
                    else cnt = 500;
                    break;
                }
            }

            result1[i] = cnt;
        }

        for(int i = 0; i < 7; i++) {
            int cnt = 0;

            for(int j = 0; j < 3; j++) {
                if(l >= arr2[i][j]) {
                    if(j == 0) cnt = 100;
                    else if(j == 1) cnt = 300;
                    else cnt = 500;
                    break;
                }
            }

            result2[i] = cnt;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++) {
            sb.append(result1[i]);
            if(i != 5) sb.append(" ");
        }
        sb.append("\n");
        for(int i = 0; i < 7; i++) {
            sb.append(result2[i]);
            if(i != 6) sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
