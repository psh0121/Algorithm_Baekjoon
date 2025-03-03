import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int h = sc.nextInt();
            if(h == 0) break;

            ArrayList<Integer> hn = new ArrayList<>();
            hn.add(h);
            int maxValue = h;

            while (hn.get(hn.size() - 1) != 1) {
                int idx = hn.size();    // 다음 인덱스
                int value = 0;

                if(hn.get(idx-1) % 2 == 0) {
                    value = hn.get(idx-1) / 2;
                }
                else {
                    value = 3 * hn.get(idx-1) + 1;
                }
                
                maxValue = Math.max(maxValue, value);
                hn.add(value);
            }

            System.out.println(maxValue);
        }

        sc.close();
    }
}
