import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();

        int n = sc.nextInt();
        String s = sc.next();

        int scoreA = 0;
        int scoreB = 0;

        for(int i = 0; i < n; i++) {
            char shot = s.charAt(i);

            if(shot == 'H') {
                if(i % 2 == 0) scoreA++;
                else scoreB++;
            }
            else if(shot == 'D') {
                if(i % 2 == 0) scoreA += 2;
                else scoreB += 2;
            }
            else if(shot == 'O') {
                if(i % 2 == 0) scoreB++;
                else scoreA++;
            }

            if(scoreA >= 7) {
                System.out.printf("%s %d %s %d. %s has won.\n", a, 7, b, scoreB, a);
                return;
            }

            if(scoreB >= 7) {
                System.out.printf("%s %d %s %d. %s has won.\n", a, scoreA, b, 7, b);
                return;
            }
        }

        if(scoreA > scoreB) {
            System.out.printf("%s %d %s %d. %s is winning.\n", a, scoreA, b, scoreB, a);
        }
        else if(scoreA < scoreB) {
            System.out.printf("%s %d %s %d. %s is winning.\n", a, scoreA, b, scoreB, b);
        }
        else {
            System.out.printf("%s %d %s %d. All square.\n", a, scoreA, b, scoreB);
        }

        sc.close();
    }
}