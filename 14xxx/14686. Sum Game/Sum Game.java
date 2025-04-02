import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] swifts = new int[n+1];
        int[] semaphores = new int[n+1];

        for(int i = 1; i <= n; i++) swifts[i] = sc.nextInt();
        for(int i = 1; i <= n; i++) semaphores[i] = sc.nextInt();

        int swiftsGrade = 0;
        int semaphoresGrade = 0;

        int k = 0;

        for(int i = 1; i <= n; i++) {
            swiftsGrade += swifts[i];
            semaphoresGrade += semaphores[i];

            if(swiftsGrade == semaphoresGrade) k = i;
        }

        System.out.println(k);
        sc.close();
    }
}
