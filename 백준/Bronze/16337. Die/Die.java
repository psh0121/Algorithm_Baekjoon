import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[][] diceArr = {
            {""},   // 0
            {"::::o::::"},  // 1
            {"o:::::::o", "::o:::o::"}, // 2
            {"o:::o:::o", "::o:o:o::"}, // 3
            {"o:o:::o:o"}, // 4
            {"o:o:o:o:o"}, // 5
            {"ooo:::ooo", "o:oo:oo:o"}  // 6
        };

        String dice = sc.next() + sc.next() + sc.next();

        for(int i = 1; i < diceArr.length; i++) {
            for(int j = 0; j < diceArr[i].length; j++) {
                if(diceArr[i][j].equals(dice)) {
                    System.out.println(i);
                    return;
                }
            }
        }

        System.out.println("unknown");
        sc.close();
    }
}