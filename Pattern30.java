// A  B  C  D  E 
// F  G  H  I  J
// K  L  M  N  O
// P  Q  R  S  T
// U  V  W  X  Y

public class Pattern30 {
    public static void main(String[] args) {
        int n = 5;
        char x = 'A';
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((int)x == 91) 
                    x = (char)(97);
                System.out.print(" " + x++ + " ");
            }
            System.out.println();
        }
    }
}
