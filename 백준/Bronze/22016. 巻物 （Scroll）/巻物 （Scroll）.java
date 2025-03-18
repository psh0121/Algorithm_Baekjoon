import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<Character, Character> map = new HashMap<>();
        map.put('j', 'J');
        map.put('o', 'O');
        map.put('i', 'I');
        map.put('J', 'j');
        map.put('O', 'o');
        map.put('I', 'i');

        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++) {
            if(i+1 >= k) {
                sb.append(map.get(t.charAt(i)));
            }
            else {
                sb.append(t.charAt(i));
            }
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}