import java.util.Scanner;

public class PieceOfCake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PieceOfCake m = new PieceOfCake();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int n = in.nextInt();
        int h = in.nextInt();
        int v = in.nextInt();

        h = Math.max(h, n - h);
        v = Math.max(v, n - v);
        
        System.out.println(4 * v * h);
    }
}
