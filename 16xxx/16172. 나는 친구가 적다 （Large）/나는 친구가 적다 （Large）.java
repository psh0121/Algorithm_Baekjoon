import java.util.Scanner;

public class Main {
    public static int[] setLPS(String word) {
        int n = word.length(); 
        int[] lps = new int[n];
        int i = 0;
        int j = 1;

        while (j < n) {
            if(word.charAt(i) == word.charAt(j)) {
                i++;
                lps[j] = i;
                j++;
            }
            else {
                if(i != 0) {
                    i = lps[i-1];
                }
                else {
                    lps[j] = 0;
                    j++;
                }
            }
        }

        return lps;
    }

    public static boolean KMP (String str, String word) {
        boolean result = false;
        int[] lps = setLPS(word);
        int i = 0;
        int j = 0;
        int n = str.length();
        int m = word.length();

        while (i < n) {
            if(str.charAt(i) == word.charAt(j)) {
                i++;
                j++;
                if(j == m) {
                    result = true;
                    break;
                }
            }
            else {
                if(j != 0) {
                    j = lps[j - 1];
                }
                else {
                    i++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String word = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(
                (letter >= 'a' && letter <= 'z') ||
                (letter >= 'A' && letter <= 'Z')
            ) {
                sb.append(letter);
            }
        }

        // contains는 시간복잡도가 너무 크기때문에 KMP를 사용하여 문제를 해결한다

        if(KMP(sb.toString(), word)) System.out.println(1);
        else System.out.println(0);
        sc.close();
    }
}