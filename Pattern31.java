// A  B  C  D  E  
// B  C  D  E  F  
// C  D  E  F  G  
// D  E  F  G  H  
// E  F  G  H  I  

public class Pattern31 {
    public static void main(String[] args) {
        int n = 5;
        
        for(int i = 1; i <= n; i++) {
            for(char j = (char)(64 + i); j < (char)(64+n+i); j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
    }
}
