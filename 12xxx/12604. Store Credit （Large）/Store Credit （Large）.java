import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            int purpose = sc.nextInt();
            
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int j = 0; j < n; j++) arr[j] = sc.nextInt();

            int idx1 = 0;
            int idx2 = 0;

            for(int j = 0; j < arr.length; j++) {
                boolean isBreak = false;
                for(int k = j+1; k < arr.length; k++) {
                    if(j == k) continue;

                    if(arr[j] + arr[k] == purpose) {
                        idx1 = j+1;
                        idx2 = k+1;
                        isBreak = true;
                        break;
                    }
                }

                if(isBreak) break;
            }

            System.out.println("Case #" + i + ": " + idx1 + " " + idx2);
        }
        sc.close();
    }
}