import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int[][] arr = new int[n+1][3];
        for(int i = 1; i <= n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }

        double maxCalColor = Double.MIN_VALUE;
        ArrayList<int[]> list  = new ArrayList<>();

        // 차이 구하기
        for(int i = 1; i < n+1; i++) {
            for(int j = i+1; j < n+1; j++) {
                double calColor = Math.sqrt(
                    ((arr[i][0] - arr[j][0]) * (arr[i][0] - arr[j][0])) + 
                    ((arr[i][1] - arr[j][1]) * (arr[i][1] - arr[j][1])) + 
                    ((arr[i][2] - arr[j][2]) * (arr[i][2] - arr[j][2]))
                );

                if(calColor > maxCalColor) {
                    list = new ArrayList<>();
                    list.add(new int[]{i, j});

                    maxCalColor = calColor;
                }
                else if(calColor == maxCalColor) {
                    list.add(new int[]{i, j});
                }
            }
        }

        // 기준에 맞춰 정렬하기
        list.sort((a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1];
        });

        for(int[] value : list) {
            System.out.println(value[0] + " " + value[1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            System.out.println("Data Set " + i + ":");
            solve(sc);
        }
        sc.close();
    }
}