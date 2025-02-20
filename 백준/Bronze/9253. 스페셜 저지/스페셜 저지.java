import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static String pattern;
    static int[] patternInfo;   // pattern에 대한 접두사, 접미사 일치 정보배열
    
    // pattern에 대한 접두사 접미사 정보 배열에 넣기
    public static void setPatternInfo() {
        char[] p = pattern.toCharArray();
        patternInfo = new int[p.length];
        int j = 0;

        for(int i = 1; i < p.length; i++) {
            while (j > 0 && p[i] != p[j]) {
                j = patternInfo[j-1];
            }

            if(p[i] == p[j]) {
                patternInfo[i] = ++j;
            }
        }
        return;
    }

    // pattern의 값을 포함하는지 확인하기
    public static boolean kmp(String str) {
        char[] s = str.toCharArray();
        char[] p = pattern.toCharArray();

        int j = 0;

        for(int i = 0; i < s.length; i++) {
            while (j > 0 && s[i] != p[j]) {
                j = patternInfo[j-1];
            }

            if(s[i] == p[j]) {
                if(j == p.length - 1) return true;
                else j++;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        pattern = br.readLine();
        setPatternInfo();

        if(kmp(a) && kmp(b)) System.out.println("YES");
        else System.out.println("NO");
    }
}
