import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int l = sc.nextInt();
        int w = sc.nextInt();

        // 예외조건
        if((w < l) || (w > l * 26)) {
            System.out.println("impossible");
            return;
        }

        char[] result = new char[l];
        for(int i = 0; i < l; i++) result[i] = 'a'; // 초기값

        int remain = w - l;

        // 뒤쪽부터 값을 증가시킨다
        for(int i = l-1; i >= 0; i--) {
            if(remain <= 0) break;

            int add = Math.min(25, remain);
            result[i] += add;
            remain -= add;
        }

        System.out.println(new String(result));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
