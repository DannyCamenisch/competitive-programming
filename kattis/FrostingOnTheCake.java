import java.util.Scanner;

public class FrostingOnTheCake {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FrostingOnTheCake m = new FrostingOnTheCake();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int N = in.nextInt();
        
        long[] a = new long[3];
        long[] w = new long[3];
        
        int m = 3*N;
        
        for(int i = 1; i <= N; i++) {
            w[i % 3] += in.nextInt();
        }
        
        for(int i = 1; i <= N; i++) {
            int b = in.nextInt();
            
            a[0] += b * w[(m  -i) % 3];
            a[1] += b * w[(m+1-i) % 3];
            a[2] += b * w[(m+2-i) % 3];
        }
        
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
