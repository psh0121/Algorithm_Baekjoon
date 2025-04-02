import java.util.Scanner;

public class Main {
    static void init(String[][] veraCode) {
        veraCode[0][0] = "***";
        veraCode[0][1] = "*.*";
        veraCode[0][2] = "***";
        veraCode[0][3] = "*.*";
        veraCode[0][4] = "*.*";
        veraCode[1][0] = "***";
        veraCode[1][1] = "*.*";
        veraCode[1][2] = "***";
        veraCode[1][3] = "*.*";
        veraCode[1][4] = "***";
        veraCode[2][0] = "***";
        veraCode[2][1] = "*..";
        veraCode[2][2] = "*..";
        veraCode[2][3] = "*..";
        veraCode[2][4] = "***";
        veraCode[3][0] = "***";
        veraCode[3][1] = "*.*";
        veraCode[3][2] = "*.*";
        veraCode[3][3] = "*.*";
        veraCode[3][4] = "***";
        veraCode[4][0] = "***";
        veraCode[4][1] = "*..";
        veraCode[4][2] = "***";
        veraCode[4][3] = "*..";
        veraCode[4][4] = "***";
    }

    public static String drawStar(String str, int idx, String[][] veraCode) {
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(letter == 'A') result.append(veraCode[0][idx]);
            else if(letter == 'B') result.append(veraCode[1][idx]);
            else if(letter == 'C') result.append(veraCode[2][idx]);
            else if(letter == 'D') result.append(veraCode[3][idx]);
            else if(letter == 'E') result.append(veraCode[4][idx]);
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] veraCode = new String[5][5];
        init(veraCode);

        int n = sc.nextInt();
        String str = sc.next();

        // 그림 채우기
        System.out.println(drawStar(str, 0, veraCode));
        System.out.println(drawStar(str, 1, veraCode));
        System.out.println(drawStar(str, 2, veraCode));
        System.out.println(drawStar(str, 3, veraCode));
        System.out.println(drawStar(str, 4, veraCode));
        sc.close();
    }
}