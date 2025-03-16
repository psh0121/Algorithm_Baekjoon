import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int maxCnt = 0;
        int curCnt = 1;

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();

        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] <= arr[i]) curCnt++;
            else {
                maxCnt = Math.max(maxCnt, curCnt);
                curCnt = 1;
            }
        }

        maxCnt = Math.max(maxCnt, curCnt);

        System.out.println(maxCnt);
        sc.close();
    }
}