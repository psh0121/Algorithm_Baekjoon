import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();   // 프로젝트
            int b = sc.nextInt();   // 에세이
            int c = sc.nextInt();   // 중간고사
            
            // 내가 기말고사에서 최소한 받아야하는 점수 (40% 산정한 기준)
            int minGrade = (int)Math.ceil((double)(9000 - a*15 - b*20 - c*25) / 40);

            if(minGrade > 100) System.out.println("impossible");
            else System.out.println(minGrade);

        }
        sc.close();
    }
}