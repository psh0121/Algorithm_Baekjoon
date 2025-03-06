import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int cnt = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int target = k - num;

            // target의 값이 set안에 있다면 
            // num과 target이 수열한에 동시에 있다는 의미로 개수 +1
            // 없다면 다음을 기약하며 num만 set에 넣어둔다.
            if(set.contains(target)) cnt++;

            set.add(num);
        }

        System.out.println(cnt);
        sc.close();
    }
}
