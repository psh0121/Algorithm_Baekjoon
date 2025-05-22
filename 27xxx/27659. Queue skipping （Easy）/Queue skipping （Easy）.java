import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int t = Integer.parseInt(sc.nextLine());
        sc.nextLine();

        while (t-- > 0) {
            int n = sc.nextInt();
            int e = sc.nextInt();
            sc.nextLine();

            LinkedList<Integer> list = new LinkedList<>();
            for(int i = 1; i <= n; i++) list.add(i);

            for(int i = 0; i < e; i++) {
                int person = Integer.parseInt(sc.nextLine());
                list.remove((Integer)person);   // 캐스팅을 해줘야 값이 삭제됨(캐스팅 안하면 인덱스가 삭제됨) 
                list.addFirst(person);
            }

            System.out.println(list.getLast());

            if(t != 0) sc.nextLine();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
    }
}
