import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HeartRate m = new HeartRate();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int N = in.nextInt();

        while(N-- > 0) {
            int b = in.nextInt();
            double p = in.nextDouble();

            double bpm = 60.0 * (b / p);
            double abpm = 60.0 / p;

            System.out.println((bpm - abpm) + " " + bpm + " " + (bpm + abpm));
        }
    }
}
