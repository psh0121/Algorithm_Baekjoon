import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] chess1 = {
            {"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H8"},
            {"A7", "B7", "C7", "D7", "E7", "F7", "G7", "H7"},
            {"A6", "B6", "C6", "D6", "E6", "F6", "G6", "H6"},
            {"A5", "B5", "C5", "D5", "E5", "F5", "G5", "H5"},
            {"A4", "B4", "C4", "D4", "E4", "F4", "G4", "H4"},
            {"A3", "B3", "C3", "D3", "E3", "F3", "G3", "H3"},
            {"A2", "B2", "C2", "D2", "E2", "F2", "G2", "H2"},
            {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"}
        };
        int[][] chess2 = {
            {57, 58, 59, 60, 61, 62, 63, 64},
            {49, 50, 51, 52, 53, 54, 55, 56},
            {41, 42, 43, 44, 45, 46, 47, 48},
            {33, 34, 35, 36, 37, 38, 39, 40},
            {25, 26, 27, 28, 29, 30, 31, 32},
            {17, 18, 19, 20, 21, 22, 23, 24},
            {9, 10, 11, 12, 13, 14, 15, 16},
            {1, 2, 3, 4, 5, 6, 7, 8}
        };

        String[][] chess = {
            "WBWBWBWB".split(""),
            "BWBWBWBW".split(""),
            "WBWBWBWB".split(""),
            "BWBWBWBW".split(""),
            "WBWBWBWB".split(""),
            "BWBWBWBW".split(""),
            "WBWBWBWB".split(""),
            "BWBWBWBW".split("")
        };

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            String val1 = sc.next();
            int val2 = sc.nextInt();

            String color1 = "";
            String color2 = "";

            for(int j = 0; j < 8; j++) {
                boolean isBreak = false;
                for(int k = 0; k < 8; k++) {
                    if(chess1[j][k].equals(val1)) {
                        color1 = chess[j][k];
                        
                        isBreak = true;
                        break;
                    }
                }
                if(isBreak) break;
            }

            for(int j = 0; j < 8; j++) {
                boolean isBreak = false;
                for(int k = 0; k < 8; k++) {
                    if(chess2[j][k] == val2) {
                        color2 = chess[j][k];
                        
                        isBreak = true;
                        break;
                    }
                }
                if(isBreak) break;
            }

            if(color1.equals(color2)) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
