import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();   // player count
        int r = sc.nextInt();   // round count

        int[] grade = new int[j];

        for(int i = 0; i < r; i++) {
            for(int k = 0; k < j; k++) {
                grade[k] += sc.nextInt();
            }
        }

        // 가장 높은 점수와 높은 번호표를 가진 사람 확인하기
        int maxGrade = 0;
        int num = 0;

        for(int i = 0; i < grade.length; i++) {
            if(grade[i] >= maxGrade) {
                maxGrade = grade[i];
                num = i;
            }
        }

        System.out.println(num + 1);
        sc.close();
    }
}