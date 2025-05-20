import java.util.Scanner;

public class Main {
    // 뒤에서 몇번째 모음의 위치를 파악
    public static int findIdx(String s , int location) {
        int result = -1;
        int cur = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            String c = Character.toString(s.charAt(i));

            if("aeiou".contains(c)) cur++;

            if(cur == location) {
                result = i+1;
                break;
            }
        }

        return result;
    }

    public static void solve (Scanner sc) {
        String s = sc.next();
        String lastS = Character.toString(s.charAt(s.length() - 1));

        if("aeiouns".contains(lastS)) { // 뒤에서 두번째 모음 강세
            int idx = findIdx(s, 2);
            System.out.println(idx);
        }
        else {  // 마지막 모음 강세
            int idx = findIdx(s, 1);
            System.out.println(idx);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
