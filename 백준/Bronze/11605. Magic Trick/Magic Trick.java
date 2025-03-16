import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] cal = new String[n];
        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            cal[i] = sc.next();
            num[i] = sc.nextInt();
        }

        int cnt = 0;

        for(int i = 1; i <= 100; i++) {
            double value = i;

            for(int j = 0; j < n; j++) {
                if(cal[j].equals("ADD")) value += num[j];
                else if(cal[j].equals("SUBTRACT")) value -= num[j];
                else if(cal[j].equals("MULTIPLY")) value *= num[j];
                else if(cal[j].equals("DIVIDE")) value /= num[j];

                if(value < 0 || value != (int)value) {
                    cnt++;
                    break;
                }
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}