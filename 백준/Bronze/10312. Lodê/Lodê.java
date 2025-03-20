import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            List<Integer> list = new ArrayList<>();

            while (k > 0) {
                list.add(k % 3);
                k /= 3;
            }

            Collections.reverse(list);

            StringBuilder sb = new StringBuilder();
            for(int num : list) {
                sb.append(num + " ");
            }

            System.out.println(sb.toString().trim());
        }
        sc.close();
    }
}