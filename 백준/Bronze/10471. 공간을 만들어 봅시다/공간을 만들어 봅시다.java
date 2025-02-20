import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[p+2];
        for(int i = 1; i < arr.length - 1; i++) arr[i] = sc.nextInt();
        arr[arr.length - 1] = w;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(i == j) continue;

                int calValue = Math.abs(arr[j] - arr[i]);

                if(!list.contains(calValue)) {
                    list.add(calValue);
                }
            }
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        for(int val : list) {
            sb.append(val + " ");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}
