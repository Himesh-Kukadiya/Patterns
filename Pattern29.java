// E D C B A
// E D C B A
// E D C B A
// E D C B A
// E D C B A

public class Pattern29 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            for(char j = (char)(64 + n); j >= 'A'; j--) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
}
