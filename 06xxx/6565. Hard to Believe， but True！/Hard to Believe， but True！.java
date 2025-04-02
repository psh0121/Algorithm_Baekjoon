import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if(str.equals("0+0=0")) {
                System.out.println("True");
                break;
            }

            String[] numStr = str.split("[+=]");
            int sum = 0;
            int value = Integer.parseInt(new StringBuilder(numStr[numStr.length - 1]).reverse().toString());

            for(int i = 0; i < numStr.length -1; i++) {
                sum += Integer.parseInt(new StringBuilder(numStr[i]).reverse().toString());
            }

            System.out.println(sum == value ? "True" : "False");
        }
        sc.close();
    }
}