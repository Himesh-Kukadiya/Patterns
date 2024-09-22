// 1
// 6  2
// 10  7  3
// 13 11  8  4
// 15 14 12  9  5

public class Pattern48 {
    public static void main(String[] args) {
        int n = 5, x = 1;

        for(int i = n; i >= 1; i--) {
            int y = x;
            int z = i;
            for(int j = i; j <= n; j++) { 
                System.out.print(y < 10 ? "  " + y : " " + y);
                y = y - z;
                z++;
            }
            x += i;
            System.out.println();
        }
    }
}
