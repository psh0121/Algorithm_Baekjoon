import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 0);
        map.put('c', 0);
        map.put('d', 0);

        for(int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            map.put(key, map.get(key) + 1);
        }

        // 준비한 재료만큼 버거를 만들수 있는지 확인
        if(a < map.get('a') || b < map.get('b') || c < map.get('c') || d < map.get('d')) {
            System.out.println("No");
            return;
        }

        // 양끝에 빵으로 구성되어 있는지 확인
        if(str.charAt(0) != 'a' || str.charAt(str.length() - 1) != 'a') {
            System.out.println("No");
            return;
        }

        // 길이가 2이면 무조건 안됨 예외처리
        if(str.length() == 2) {
            System.out.println("No");
            return;
        }

        // 주변에 같은 재료가 없는지 확인
        for(int i = 1; i < str.length() - 1; i++) {
            char left = str.charAt(i-1);
            char mid = str.charAt(i);
            char right = str.charAt(i+1);

            if(left == mid || mid == right) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        sc.close();
    }
}
