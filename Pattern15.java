// 5  6 15 16 25 
// 4  7 14 17 24
// 3  8 13 18 23
// 2  9 12 19 22
// 1 10 11 20 21

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 5; i >= 1; i--) {
            int x = i;
            int y = n - i + 1;
            for(int j = 1; j <= n; j++) {
                if(j % 2 == 1)
                    System.out.print(x < 10 ? " " + x + " " : x + " ");
                else 
                    System.out.print(y < 10 ? " " + y + " " : y + " ");
                x += n;
                y += n;
            }
            System.out.println();
        }
    }
}
