import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] calAB = {a+b, a-b, a*b};
        int maxValue = Math.max(calAB[0], Math.max(calAB[1], calAB[2]));
        int maxValueCnt = 0;

        for(int i = 0; i < calAB.length; i++) if(calAB[i] == maxValue) maxValueCnt++;

        if(maxValueCnt > 1) {
            System.out.println("NIE");
            return;
        }

        String strA = a < 0 ? "(" + a + ")" : Integer.toString(a);
        String strB = b < 0 ? "(" + b + ")" : Integer.toString(b);
        String strC = maxValue < 0 ? "(" + maxValue + ")" : Integer.toString(maxValue);

        // +
        if(maxValue == calAB[0]) {
            System.out.println(strA + "+" + strB + "=" + strC);
        }
        // -
        else if(maxValue == calAB[1]) {
            System.out.println(strA + "-" + strB + "=" + strC);
        }
        // *
        else {
            System.out.println(strA + "*" + strB + "=" + strC);
        }
        sc.close();
    }
}