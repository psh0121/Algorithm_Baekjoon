import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int maxDay = 0;
        int day = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) day++;
            else {
                if(i > 0 && arr[i-1] == 0) {
                    maxDay = Math.max(day, maxDay);
                    day = 0;
                }
                else continue;
            }
        }

        maxDay = Math.max(maxDay, day);

        System.out.println(maxDay);
        sc.close();
    }
}
