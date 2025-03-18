import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        String result = "yes";

        for(int i = 1; i < n; i++) {
            int one = arr[i-1];
            int two = arr[i];

            if(one > two) {
                result = "no";
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}