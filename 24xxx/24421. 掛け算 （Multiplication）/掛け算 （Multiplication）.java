import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        int cnt = 0;

        for(int x = 0; x < n; x++) {
            for(int y = x+1; y < n; y++) {
                for(int z = y+1; z < n; z++) {
                    if(arr[x] * arr[y] == arr[z]) cnt++;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}