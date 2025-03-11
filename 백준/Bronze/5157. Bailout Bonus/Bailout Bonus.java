import java.util.Scanner;

public class Main {
    public static int calTax(Scanner sc) {
        int tax = 0;
        String[] temp = sc.nextLine().split(" ");
        int c = Integer.parseInt(temp[0]);   // 회사수
        int b = Integer.parseInt(temp[1]);   // 긴급구제금 받은 회사수
        int n = Integer.parseInt(temp[2]);   // 이사진수
        int r = Integer.parseInt(temp[3]);   // 세율

        // 만약 긴급구제금을 받은 회사수가 없으면 넘겨버리자
        if(b == 0) {
            sc.nextLine();

            for(int i = 0; i < n; i++) sc.nextLine();
        }
        else {
            String[] temp2 = sc.nextLine().split(" ");
            int[] company = new int[temp2.length];

            for(int i = 0; i < company.length; i++) company[i] = Integer.parseInt(temp2[i]);

            // 긴급구제금 받은 이사진들에게 세금을 받아내자
            for(int i = 0; i < n; i++) {
                String[] temp3 = sc.nextLine().split(" ");
                int companyNum = Integer.parseInt(temp3[0]);
                int companyMoney = Integer.parseInt(temp3[1]);

                // 긴급구제금받은 회사에 소속되어 있는가?
                boolean isContain = false;
                for(int j = 0; j < company.length; j++) {
                    if(company[j] == companyNum) {
                        isContain = true;
                        break;
                    }
                }

                // 구제금 받은 이사진에 대해서 세금을 받는다.
                if(isContain) {
                    tax += companyMoney * r / 100;
                }
            }
        }

        return tax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= n; i++) {
            System.out.println("Data Set " + i + ":");
            System.out.println(calTax(sc));
            System.out.println();
        }
        sc.close();
    }
}