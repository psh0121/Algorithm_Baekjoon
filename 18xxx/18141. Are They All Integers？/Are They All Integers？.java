import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j) continue;

                int diff = arr[i] - arr[j];

                for(int k = 0; k < n; k++) {
                    if(k == i || k == j) continue;

                    if(diff % arr[k] != 0) {
                        System.out.println("no");
                        return;
                    }
                }
            }
        }
        System.out.println("yes");
        sc.close();
        
    }
}