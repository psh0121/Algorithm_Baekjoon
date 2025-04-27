import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            String[] arr = sc.nextLine().split(" ");
            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, arr);

            int idx = 1;    // 계산문자 포함되어 있는 인덱스

            while (idx <= list.size() - 1) {
                if("*/%".contains(list.get(idx))) {
                    int a = Integer.parseInt(list.get(idx-1));
                    int b = Integer.parseInt(list.get(idx+1));
                    char cal = list.get(idx).charAt(0);

                    list.remove(idx-1);
                    list.remove(idx-1);
                    list.remove(idx-1);

                    int calValue = 0;
                    
                    if(cal == '*') calValue = a * b;
                    else if(cal == '/') calValue = a / b;
                    else if(cal == '%') calValue = a % b;

                    list.add(idx-1, Integer.toString(calValue));
                }

                idx += 2;
            }

            while (list.size() != 1) {
                int a = Integer.parseInt(list.get(0));
                int b = Integer.parseInt(list.get(2));
                char cal = list.get(1).charAt(0);

                list.remove(0);
                list.remove(0);
                list.remove(0);

                int calValue = 0;

                if(cal == '+') calValue = a + b;
                else calValue = a - b;
                
                list.add(0, Integer.toString(calValue));
            }

            System.out.println(list.get(0));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}