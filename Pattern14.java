public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 1; i--) {
            int x = i;
            for(int j = 1; j <= n; j++) {
                System.out.print(x < 10 ? " " + x + " " : x + " ");
                x += n;
            }
            System.out.println();
        }
    }
}
