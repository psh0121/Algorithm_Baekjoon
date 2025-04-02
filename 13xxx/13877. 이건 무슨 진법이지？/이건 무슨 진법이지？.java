import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // 테스트 케이스의 개수
        
        // 테스트 케이스 처리
        for (int j = 0; j < t; j++) {
            int i = sc.nextInt(); // 데이터 번호
            String n = sc.next(); // 숫자 문자열

            // 8진수로 변환 가능한지 체크 (8 또는 9가 포함되어 있으면 8진수 불가)
            int o = (n.matches("[0-7]+")) ? Integer.parseInt(n, 8) : 0;

            // 출력
            System.out.println(i + " " + o + " " + Integer.parseInt(n) + " " + Integer.parseInt(n, 16));
        }

        sc.close();
    }
}
