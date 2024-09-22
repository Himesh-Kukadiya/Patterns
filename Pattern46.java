// 2
// 4  6
// 8 10 12
// 14 16 18 20
// 22 24 26 28 30

public class Pattern46 {
    public static void main(String[] args) {
        int n = 5, x = 2;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(x < 10 ? "  " + x : " " + x);
                x += 2;
            }
            System.out.println();
        }
    }
}
