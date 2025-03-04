import java.util.Scanner;

public class Main {
    public static void setGoBackInfo(int[] go, int[] back, String val1, String val2) {
        // go
        for(int i = 0; i < val1.length(); i++) {
            int asciiV1 = (int)val1.charAt(i);
            int asciiV2 = (int)val2.charAt(i);

            if(asciiV2 - asciiV1 > 0) go[i] = asciiV2 - asciiV1;
            else go[i] = (122 - asciiV1) + (asciiV2 - 97) + 1;
        }

        // back
        for(int i = 0; i < val1.length(); i++) {
            int asciiV1 = (int)val1.charAt(i);
            int asciiV2 = (int)val2.charAt(i);

            if(asciiV1 - asciiV2 > 0) back[i] = asciiV1 - asciiV2;
            else back[i] = (asciiV1 - 97) + (122 - asciiV2) + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.nextLine();
            if(str.equals("#")) break;

            String[] arr = str.split(" ");
            String s1 = arr[0];
            String s2 = arr[1];
            String s3 = arr[2];

            // 앞뒤중 어디로 가는지 정보 파악
            int[] goS1S2 = new int[s1.length()];
            int[] backS1S2 = new int[s1.length()];
            int[] goS2S3 = new int[s1.length()];
            int[] backS2S3 = new int[s1.length()];

            setGoBackInfo(goS1S2, backS1S2, s1, s2);
            setGoBackInfo(goS1S2, backS2S3, s2, s3);

            int[] realInfo = new int[s1.length()];

            for(int i = 0; i < s1.length(); i++) {
                if(goS1S2[i] == goS2S3[i]) realInfo[i] = goS1S2[i];
                else realInfo[i] = backS1S2[i] * -1;
            }

            String s4 = "";

            for(int i = 0; i < s1.length(); i++) {
                int asciiInfo = (int)s3.charAt(i);

                int s4Num = asciiInfo + realInfo[i];

                if(s4Num > 122) {
                    s4Num = s4Num - 122 + 96;
                }
                else if(s4Num < 97) {
                    s4Num = 123 - (97 - s4Num);
                }

                s4 += (char)s4Num;
            }

            System.out.println(str + " " + s4);
        }
        sc.close();
    }
}
