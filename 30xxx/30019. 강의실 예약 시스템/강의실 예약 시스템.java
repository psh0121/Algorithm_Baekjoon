import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 강의실개수
        int m = sc.nextInt();

        int[] classInfo = new int[n+1];
        int[] startTime = new int[n+1];
        int[] endTime = new int[n+1];

        for(int i = 0; i < m; i++) {
          int k = sc.nextInt(); // 예약희망 강의실
          int s = sc.nextInt(); // 시작시간
          int e = sc.nextInt(); // 종료시간

          if(classInfo[k] == 0) {
            classInfo[k] = 1;
            startTime[k] = s;
            endTime[k] = e;

            System.out.println("YES");
          }
          else {
            if(s >= startTime[k] && s < endTime[k]) {
              System.out.println("NO");
            }
            else {
              startTime[k] = s;
              endTime[k] = e;
              
              System.out.println("YES");
            }
          }
        }
        sc.close();
    }
}
