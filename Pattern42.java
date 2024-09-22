// 1 
// 2  3 
// 3  4  5
// 4  5  6  7
// 5  6  7  8  9

public class Pattern42 {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++) {
            int x = i;
            for(int j = 1; j <= i; j++) {
                System.out.print(" " + x + " ");
                x++;
            }
            System.out.println();
        }
    }
}
