import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = -1;

        for(int i = x + 1; i <= 9999; i++) {
            String strYear = Integer.toString(i);
            int front = Integer.parseInt(strYear.substring(0, 2));
            int back = Integer.parseInt(strYear.substring(2, 4));

            if(Math.pow((front + back), 2) == i) {
                result = i;
                break;
            }
        }

        System.out.println(result);
        sc.close();
    }
}
