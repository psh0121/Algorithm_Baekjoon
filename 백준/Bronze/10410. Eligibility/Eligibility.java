import java.util.Scanner;

public class Main {
    public static String solve(Scanner sc) {
        String name = sc.next();    // 이름
        String date = sc.next();   // 입학날짜
        String birth = sc.next();   // 생년월일
        int cnt = sc.nextInt();     // 수강과목수

        String[] dateArr = date.split("/");
        int dateYear = Integer.parseInt(dateArr[0]);
        String[] birthArr = birth.split("/");
        int birthYear = Integer.parseInt(birthArr[0]);

        if(dateYear >= 2010) return name + " eligible";
        if(birthYear >= 1991) return name + " eligible";
        if(cnt >= 41) return name + " ineligible";
        return name + " coach petitions";
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(solve(sc));
        }
        sc.close();
    }
}