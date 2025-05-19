import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        ArrayList<Double>[] data = new ArrayList[n];
        for(int i = 0; i < n; i++) data[i] = new ArrayList<>();

        // 점과 점사이의 거리 계산해서 data에 넣는다.
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int[] a = {arr[i][0], arr[i][1]};
                int[] b = {arr[j][0], arr[j][1]};

                double distance = Math.sqrt((b[0] - a[0]) * (b[0] - a[0]) + (b[1] - a[1]) * (b[1] - a[1]));

                data[i].add(distance);
                data[j].add(distance);
            }
        }

        double minValue = Double.MAX_VALUE;

        for(int i = 0; i < n; i++) {
            double sum = 0;

            for(int j = 0; j < n-1; j++) {
                sum += data[i].get(j);
            }

            minValue = Math.min(minValue, sum/(n-1));
        }

        System.out.println(minValue);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
