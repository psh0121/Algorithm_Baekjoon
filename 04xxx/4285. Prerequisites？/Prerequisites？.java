import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (true) {
            int k = sc.nextInt();   // Frediie가 선택한 과목수
            if(k == 0) break;
            int m = sc.nextInt();   // 카테고리수
            
            // Freddie가 선택한 과목 리스트
            String[] subject = new String[k];   
            for(int i = 0; i < k; i++) subject[i] = sc.next();

            String result = "yes";

            // 카테고리 정보
            for(int i = 0; i < m; i++) {
                int a = sc.nextInt();   // 카테고리 과목 수
                int b = sc.nextInt();   // 최소선택해야하는 과목 수

                int c = 0;  // Frediie가 선택한 과목과 일치하는 수
                for(int j = 0; j < a; j++) {
                    String subjectCT = sc.next();

                    if(Arrays.asList(subject).contains(subjectCT)) c++;
                }

                if(b > c) result = "no";
            }

            System.out.println(result);

        }
        sc.close();
    }
}