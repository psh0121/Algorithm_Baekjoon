import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        String[] arr = sc.nextLine().split(" ");
        int arrLen = arr.length;
        int aeCnt = 0;

        for(int i = 0; i < arrLen; i++) {
            if(arr[i].contains("ae")) aeCnt++;
        }

        double percentage = (double)aeCnt / arrLen * 100;

        System.out.println(percentage >= 40.0 ? "dae ae ju traeligt va" : "haer talar vi rikssvenska");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
