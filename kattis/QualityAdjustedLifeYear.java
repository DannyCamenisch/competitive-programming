import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QualityAdjustedLifeYear m = new QualityAdjustedLifeYear();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int N = in.nextInt();

        double product = 0;

        while(N-- > 0) {
            double q = in.nextDouble();
            double y = in.nextDouble();

            product += q*y;
        }

        System.out.println(product);
    }
}
