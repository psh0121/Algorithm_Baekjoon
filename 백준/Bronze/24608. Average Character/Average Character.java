import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char[] arr = sc.nextLine().toCharArray();
        int cnt = arr.length;
        int sum = 0;

        for(int i = 0; i < cnt; i++) sum += (int)arr[i];

        int avg = sum / cnt;

        System.out.println((char)avg);
        sc.close();
    }
}