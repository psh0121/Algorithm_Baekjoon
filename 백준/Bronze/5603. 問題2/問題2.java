import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String value = sc.next();
        StringBuilder result = new StringBuilder();

        while (n-- > 0) {
            int startIdx = 0;
            int cnt = 1;

            for(int i = 1; i < value.length(); i++) {
                if(value.charAt(startIdx) == value.charAt(i)) {
                    cnt++;
                }
                else {
                    result.append(Integer.toString(cnt) + value.charAt(startIdx));
                    startIdx = i;
                    cnt = 1;
                }
            }

            result.append(Integer.toString(cnt) + value.charAt(startIdx));

            value = result.toString();
            result = new StringBuilder();
        }

        System.out.println(value);
        sc.close();
    }
}