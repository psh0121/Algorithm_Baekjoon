import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        double maxDistance = 0;
        int cowNum1 = 0;
        int cowNum2 = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int x1 = arr[i][0];
                int y1 = arr[i][1];
                int x2 = arr[j][0];
                int y2 = arr[j][1];

                double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

                if(maxDistance < distance) {
                    maxDistance = distance;
                    cowNum1 = i+1;
                    cowNum2 = j+1;
                }
            }
        }

        System.out.println(cowNum1 + " " + cowNum2);

        sc.close();
        
    }
}