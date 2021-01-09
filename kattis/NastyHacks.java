import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        NastyHacks m = new NastyHacks();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int n = in.nextInt();

        while(n-- > 0) {
            int noAd = in.nextInt();
            int ad = in.nextInt() - in.nextInt();

            if(noAd < ad) {
                System.out.println("advertise");
            } else if(noAd == ad) {
                System.out.println("does not matter");
            } else {
                System.out.println("do not advertise");
            }
        }
    }
}
