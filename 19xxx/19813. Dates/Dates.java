import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // 개행 문자 제거

        while (t-- > 0) {
            String str = sc.nextLine(); // 한 줄 전체 읽기

            if(str.contains(".")) { // "day.month.year" 형식
                String[] arr = str.split("\\.");
                int day = Integer.parseInt(arr[0]);
                int month = Integer.parseInt(arr[1]);
                int year = Integer.parseInt(arr[2]);

                System.out.printf("%02d.%02d.%04d %02d/%02d/%04d\n", day, month, year, month, day, year);
            }
            else { // "month/day/year" 형식
                String[] arr = str.split("/");
                int month = Integer.parseInt(arr[0]);
                int day = Integer.parseInt(arr[1]);
                int year = Integer.parseInt(arr[2]);

                System.out.printf("%02d.%02d.%04d %02d/%02d/%04d\n", day, month, year, month, day, year);
            }
        }
        sc.close();
    }
}
