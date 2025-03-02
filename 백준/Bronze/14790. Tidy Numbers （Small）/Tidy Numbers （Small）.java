import java.util.Scanner;

public class Main {
    public static boolean isTidy(String number) {
        boolean result = true;

        if(number.length() == 1) result = true;
        else {
            for(int i = 1; i < number.length(); i++) {
                int before = Character.getNumericValue(number.charAt(i-1));
                int cur = Character.getNumericValue(number.charAt(i));

                if(before > cur) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static String getTidyNum(String number) {
        StringBuilder tidyNum = new StringBuilder(number);

        while (!isTidy(tidyNum.toString())) {
            for(int i = tidyNum.length() - 1; i >= 0; i--) {
                int before = Character.getNumericValue(tidyNum.charAt(i - 1));
                int cur = Character.getNumericValue(tidyNum.charAt(i));

                if(before > cur) {
                    tidyNum.setCharAt(i-1, (char)(tidyNum.charAt(i-1)-1));

                    for(int j = i; j < tidyNum.length(); j++) {
                        tidyNum.setCharAt(j, '9');
                    }
                    break;
                }
            }
        }

        // 앞에 0 제거
        while (tidyNum.charAt(0) == '0') {
            tidyNum.deleteCharAt(0);
        }

        return tidyNum.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            String number = sc.next();

            System.out.println("Case #" + i + ": " + getTidyNum(number));
        }
        sc.close();
    }
}
