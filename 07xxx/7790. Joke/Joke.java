import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            
            // str에서 하나하나 joke를 찾아서 개수를 파악한다
            for(int i = 3; i < str.length(); i++) {
                char j = str.charAt(i-3);
                char o = str.charAt(i-2);
                char k = str.charAt(i-1);
                char e = str.charAt(i);

                if(j == 'j' && o == 'o' && k == 'k' && e == 'e') cnt++;
            }
        }

        System.out.println(cnt);
        sc.close();
    }
}