import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

            boolean isArithmeticSequence = true;
            int differ = arr[1] - arr[0];

            for(int i = 2; i < arr.length; i++) {
                int curDiffer = arr[i] - arr[i-1];

                if(curDiffer != differ) {
                    isArithmeticSequence = false;
                    break;
                }
            }

            if(isArithmeticSequence) {
                int[] newArr = new int[5];
                newArr[0] = arr[arr.length - 1] + differ;
                newArr[1] = newArr[0] + differ;
                newArr[2] = newArr[1] + differ;
                newArr[3] = newArr[2] + differ;
                newArr[4] = newArr[3] + differ;

                System.out.println("The next 5 numbers after " + Arrays.toString(arr) + " are: " + Arrays.toString(newArr));
            }
            else {
                System.out.println("The sequence " + Arrays.toString(arr) + " is not an arithmetic sequence.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}