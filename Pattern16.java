public class Pattern16 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(int j = i; j <= i+n - 1; j++) {
                System.out.print(j < 10 ? " " + j + " " : j + " ");
            }
            System.out.println();
        }
    }
}
