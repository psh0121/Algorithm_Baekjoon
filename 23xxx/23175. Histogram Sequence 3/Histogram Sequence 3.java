import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        int beforeNum = 0;
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                beforeNum = sc.nextInt();
                cnt = 1;
                continue;
            }

            int num = sc.nextInt();

            if(beforeNum == cnt) {
                list.add(beforeNum);
                beforeNum = num;
                cnt = 1;
            }
            else if(cnt < beforeNum) {
                cnt++;
            }
        }

        list.add(beforeNum);

        StringBuilder sb = new StringBuilder();

        for(Integer value : list) {
            sb.append(value + " ");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}
