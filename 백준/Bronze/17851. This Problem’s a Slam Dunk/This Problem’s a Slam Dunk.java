import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer[] arr1 = new Integer[5];
        Integer[] arr2 = new Integer[5];
        
        for(int i = 0; i < 5; i++) arr1[i] = sc.nextInt();
        for(int i = 0; i < 5; i++) arr2[i] = sc.nextInt();

        Arrays.sort(arr1, (a, b) -> b - a);
        Arrays.sort(arr2, (a, b) -> b - a);

        int cnt = 0;

        for(int i = 0; i < 5; i++) {
            if(arr2[i] < arr1[i]) cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}