import java.util.Scanner;

public class Main {
    public static int getHeihgt(String height) {
        // height를 피트와 인치 기준으로 나누고 인치값으로 출력한다
        String[] parts = height.split("[\'\"]");
        int feet = Integer.parseInt(parts[0]);
        int inch = Integer.parseInt(parts[1]);

        return feet * 12 + inch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 1; i <= t; i++) {
            char child = sc.next().charAt(0);
            int mom = getHeihgt(sc.next());
            int father = getHeihgt(sc.next());

            // 부모의 키 합산
            int calHeight = mom + father;

            calHeight += child == 'B' ? 5 : -5;

            int start = (calHeight+1) / 2 - 4;
            int end = calHeight / 2 + 4;

            int startFeet = (int)(start / 12);
            int startInches = (int)(start % 12);
            int endFeet = (int)(end / 12);
            int endInches = (int)(end % 12);

            System.out.println(
                "Case #" + i + ": " +
                startFeet + "\'" + startInches + "\" to " +
                endFeet + "\'" + endInches + "\""
            );
        }
        sc.close();
    }
}