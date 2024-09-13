// 1  6 11 16 21
// 2  7 12 17 22
// 3  8 13 18 23
// 4  9 14 19 24
// 5 10 15 20 25

public class Pattern12 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            int x = i;
            for(int j = 1; j <= n; j++) {
                System.out.print(x < 10 ? " " + x + " " : x + " ");
                x += n;
            }
            System.out.println();
        }
    }
}
