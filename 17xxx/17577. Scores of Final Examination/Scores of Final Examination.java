import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();   // 학생수
            int m = sc.nextInt();   // 과목수

            if(n == 0 && m == 0) break;

            int[][] arr = new int[m][n];

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            // 학생들의 점수 합계를 구하고 가장 높은 값을 가진 학생의 점수를 구한다
            int maxValue = 0;

            for(int i = 0; i < n; i++) {
                int value = 0;
                for(int j = 0; j < m; j++) {
                    value += arr[j][i];
                }

                maxValue = Math.max(maxValue, value);
            }

            System.out.println(maxValue);
        }
        sc.close();
    }
}