import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        int n = Integer.parseInt(sc.nextLine());   // restuarant cnt
        String result = "";

        for(int i = 0; i < n; i++) {
            int m = Integer.parseInt(sc.nextLine());   // menu cnt;
            String name = sc.nextLine();
            boolean peasoup = false;
            boolean pancakes = false;

            for(int j = 0; j < m; j++) {
                String menu = sc.nextLine();

                if(menu.equals("pea soup")) peasoup = true;
                else if(menu.equals("pancakes")) pancakes = true;
            }

            if(peasoup && pancakes) {
                if(result.length() == 0) result = name;
            }
        }

        if(result.length() == 0) System.out.println("Anywhere is fine I guess");
        else System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
