import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int k = sc.nextInt();
        int[] kArr = new int[k];
        for(int i = 0; i < k; i++) kArr[i] = sc.nextInt();
        Arrays.sort(kArr);

        Set<Integer> set = new HashSet<>();

        for(int i = 1; i <= n; i++) {
            boolean isContain = false;

            for(int j = 0; j < k; j++) {
                if(kArr[j] == i) {
                    isContain = true;
                    break;
                }
            }

            if(isContain) {
                int p = sc.nextInt();

                for(int j = 0; j < p; j++) set.add(sc.nextInt());
            }
            else {
                int p = sc.nextInt();

                for(int j = 0; j < p; j++) sc.nextInt();
            }
        }

        System.out.println(set.size() == m ? "yes" : "no");
        sc.close();
    }
}
