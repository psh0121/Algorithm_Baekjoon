import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        double l = sc.nextDouble();
        double h = sc.nextDouble();
        double p = sc.nextDouble();
        double e = sc.nextDouble();
        int n = sc.nextInt();

        Map<String, Integer> getGrade = new HashMap<>();    // 획득점수
        Map<String, Integer> totalGrade = new HashMap<>();  // 전체점수

        getGrade.put("Lab", 0);
        getGrade.put("Hw", 0);
        getGrade.put("Proj", 0);
        getGrade.put("Exam", 0);

        totalGrade.put("Lab", 0);
        totalGrade.put("Hw", 0);
        totalGrade.put("Proj", 0);
        totalGrade.put("Exam", 0);

        for(int i = 0; i < n; i++) {
            String category = sc.next();
            
            String temp = sc.next();
            int num = Integer.parseInt(temp.substring(0, temp.length() - 1));

            String[] temp2 = sc.next().split("/");
            int get = Integer.parseInt(temp2[0]);
            int total = Integer.parseInt(temp2[1]);

            getGrade.put(category, getGrade.get(category) + get);
            totalGrade.put(category, totalGrade.get(category) + total);
        }

        // 비율 반영하기
        double lab = l * getGrade.get("Lab") / totalGrade.get("Lab");
        double hw = h * getGrade.get("Hw") / totalGrade.get("Hw");
        double proj = p * getGrade.get("Proj") / totalGrade.get("Proj");
        double exam = e * getGrade.get("Exam") / totalGrade.get("Exam");

        System.out.println((int)(lab + hw + proj + exam));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
