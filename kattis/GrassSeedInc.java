import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GrassSeedInc m = new GrassSeedInc();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        double C = in.nextDouble();
        int L = in.nextInt();

        double res = 0;

        while(L-- > 0) {
            double w = in.nextDouble();
            double l = in.nextDouble();

            res += w*l * C;
        }

        System.out.println(res);
    }
}