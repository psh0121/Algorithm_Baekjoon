import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();

            while (true) {
                num++;

                if(!Integer.toString(num).contains("0")) {
                    System.out.println(num);
                    break;
                }
            }
        }
        sc.close();
    }
}