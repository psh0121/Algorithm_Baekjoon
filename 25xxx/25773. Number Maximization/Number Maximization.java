import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        int[] nums = new int[arr.length];
        for(int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(nums);

        String result = "";

        for(int i = nums.length - 1; i >= 0; i--) {
            result += nums[i];
        }

        System.out.println(result);
        sc.close();
    }
}
