import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String NLCS = "North London Collegiate School";
        String BHA = "Branksome Hall Asia";
        String KIS = "Korea International School";
        String SJA = "St. Johnsbury Academy";

        // 1> 공백과 문장부호를 없앤다
        NLCS = NLCS.replaceAll(" ", "");
        BHA = BHA.replaceAll(" ", "");
        KIS = KIS.replaceAll(" ", "");
        SJA = SJA.replaceAll("\\.", "");
        SJA = SJA.replaceAll(" ", "");

        // 2> 대문자 -> 소문자
        NLCS = NLCS.toLowerCase();
        BHA = BHA.toLowerCase();
        KIS = KIS.toLowerCase();
        SJA = SJA.toLowerCase();

        // 3> 10글자 제외 삭제
        NLCS = NLCS.substring(0, 10);
        BHA = BHA.substring(0, 10);
        KIS = KIS.substring(0, 10);
        SJA = SJA.substring(0, 10);

        char[] arr = sc.next().toCharArray();

        for(int i = 0; i <= 25; i++) {
            for(int j = 0; j < arr.length; j++) {
                int ascii = (int)arr[j] + 1;
                
                if(ascii == 123) ascii = 97;
                arr[j] = (char)ascii;
            }

            String str = new String(arr);

            if(NLCS.equals(str)) {
                System.out.println("NLCS");
                return;
            }
            else if(BHA.equals(str)) {
                System.out.println("BHA");
                return;
            }
            else if(KIS.equals(str)) {
                System.out.println("KIS");
                return;
            }
            else if(SJA.equals(str)) {
                System.out.println("SJA");
                return;
            }
        }

        sc.close();
    }
}
