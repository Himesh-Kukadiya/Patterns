// A  F  K  P  U 
// B  G  L  Q  V
// C  H  M  R  W
// D  I  N  S  X
// E  J  O  T  Y

public class Pattern32 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++) {
            char x = (char)(64 + i);
            for(int j = i; j <= n + i - 1; j++) {
                System.out.print(" " + x + " ");
                x += n;
            }
            System.out.println();
        }
    }
}
