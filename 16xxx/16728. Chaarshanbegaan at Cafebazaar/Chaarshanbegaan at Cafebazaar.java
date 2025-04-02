import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int totalScore = 0;
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 점과 점사이 d의 길이를 구하고 d에 따라 값을 부여한다.
            double d = Math.sqrt(x*x + y*y);

            if(d <= 10) totalScore += 10;
            else if(d <= 30) totalScore += 9;
            else if(d <= 50) totalScore += 8;
            else if(d <= 70) totalScore += 7;
            else if(d <= 90) totalScore += 6;
            else if(d <= 110) totalScore += 5;
            else if(d <= 130) totalScore += 4;
            else if(d <= 150) totalScore += 3;
            else if(d <= 170) totalScore += 2;
            else if(d <= 190) totalScore += 1;
            else totalScore += 0;
        }

        System.out.println(totalScore);
        sc.close();
    }
}