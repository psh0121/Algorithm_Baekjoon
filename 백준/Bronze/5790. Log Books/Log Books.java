import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
          int n = sc.nextInt();
          if(n == 0) break;
          
          int[] sunriseInfo = new int[n]; // 일출
          int[] sunsetInfo = new int[n];  // 일몰
          int[] startInfo = new int[n]; // 시작
          int[] endInfo = new int[n]; // 종료

          for(int i = 0; i < n; i++) {  // 정보 채우기
            String[] temp = sc.next().split(":");
            sunriseInfo[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
            temp = sc.next().split(":");
            sunsetInfo[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
            temp = sc.next().split(":");
            startInfo[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
            temp = sc.next().split(":");
            endInfo[i] = Integer.parseInt(temp[0]) * 60 + Integer.parseInt(temp[1]);
          }

          int totalDriveTime = 0; // 운전시간
          int totalNightTime = 0; // 야간시간
          boolean over2Hours = false; // 단일운전이 2시간 초과되는지 확인

          for(int i = 0; i < n; i++) {
            int driveTime = endInfo[i] - startInfo[i];
            if(driveTime > 120) { // 운전시간 2시간 넘는가
              over2Hours = true;
              break;
            }

            totalDriveTime += driveTime;

            if(startInfo[i] < sunriseInfo[i]) {
              int nightTime = sunriseInfo[i] - startInfo[i];

              if(nightTime * 2 >= driveTime) {
                totalNightTime += driveTime;
              }
              else totalNightTime += nightTime;
            }
            else if(endInfo[i] > sunsetInfo[i]) {
              int nightTime = endInfo[i] - sunsetInfo[i];

              if(nightTime * 2 >= driveTime) {
                totalNightTime += driveTime;
              }
              else totalNightTime += nightTime;
            }
          }

          if(!over2Hours && totalDriveTime >= 3000 && totalNightTime >= 600) System.out.println("PASS");
          else System.out.println("NON");

        }
        sc.close();
    }
}