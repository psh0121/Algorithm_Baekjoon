import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int start = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        boolean isReject = false;

        list.add(start);

        int cur = start;
        
        while (true) {
            String s = sc.next();
            if(s.equals("#")) break;

            char direction = s.charAt(0);
            int num = s.charAt(1) - '0';

            if(direction == 'A') cur -= num;
            else cur += num;

            if(cur < 1) cur += 8;
            else if(cur > 8) cur -= 8;

            if(list.contains(cur)) isReject = true;

            list.add(cur);
        }

        StringBuilder sb = new StringBuilder();
        for(int value : list) sb.append(value + " ");

        if(isReject || list.size() < 5) sb.append("reject");

        System.out.println(sb.toString().trim());

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
