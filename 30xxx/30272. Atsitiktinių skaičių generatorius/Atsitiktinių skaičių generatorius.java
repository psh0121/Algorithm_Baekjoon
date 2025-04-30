import java.util.Scanner;

public class Main {
    public static void fillNumArr(String s, StringBuilder[] num) {
        String[] arr = s.split("  ");

        for(int i = 0; i < arr.length; i++) {
            num[i].append(arr[i]).append("\n");
        }
    }

    public static void solve (Scanner sc) {
        StringBuilder[] num = new StringBuilder[10];
        for(int i = 0; i < 10; i++) num[i] = new StringBuilder();

        // 배열 채우기
        fillNumArr("..#####..  ....##...  .#######.  .#######.  ##.......  .########  .#######.  .########  .#######.  .#######.", num);
        fillNumArr(".##...##.  ..####...  ##.....##  ##.....##  ##....##.  .##......  ##.....##  .##....##  ##.....##  ##.....##", num);
        fillNumArr("##.....##  ....##...  .......##  .......##  ##....##.  .##......  ##.......  .....##..  ##.....##  ##.....##", num);
        fillNumArr("##.....##  ....##...  .#######.  .#######.  ##....##.  .#######.  ########.  ....##...  .#######.  .########", num);
        fillNumArr("##.....##  ....##...  ##.......  .......##  #########  .......##  ##.....##  ...##....  ##.....##  .......##", num);
        fillNumArr(".##...##.  ....##...  ##.......  ##.....##  ......##.  .##....##  ##.....##  ...##....  ##.....##  ##.....##", num);
        fillNumArr("..#####..  ..######.  #########  .#######.  ......##.  ..######.  .#######.  ...##....  .#######.  .#######.", num);
        fillNumArr(".........  .........  .........  .........  .........  .........  .........  .........  .........  .........", num);

        String result = "";

        int n = sc.nextInt();

        while(n-- > 0) {
            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < 8; i++) sb.append(sc.next()).append("\n");
            
            String str = sb.toString().trim();

            for(int j = 0; j < 10; j++) {
                if(str.equals(num[j].toString().trim())) {
                    result += j;
                    break;
                }
            }
        }

        System.out.println(result);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
