import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pot m = new Pot();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int N = in.nextInt();
        int sum = 0;

        while(N-- > 0) {
            int P = in.nextInt();
            sum += Math.pow(Math.floorDiv(P, 10), P % 10);
        }

        System.out.println(sum);
    }
}
