import java.util.Scanner;

public class ShatteredCake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ShatteredCake m = new ShatteredCake();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        long W = in.nextLong();
        long N = in.nextInt();
        
        long volume = 0;
        
        int c = 0;
        while(c++ < N) {
            volume += (in.nextInt() * in.nextInt());
        }
        
        System.out.println(volume / W);
    }
}
