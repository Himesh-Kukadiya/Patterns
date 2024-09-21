// E  J  O  T  Y 
// D  I  N  S  X 
// C  H  M  R  W 
// B  G  L  Q  V
// A  F  K  P  U

public class Pattern33 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = n; i >= 1; i--) {
            char c = (char)(64 + i);
            for(int j = 1; j <= n; j++) {
                System.out.print(" " + c + " ");
                c += n;
            }
            System.out.println();
        }
    }
}