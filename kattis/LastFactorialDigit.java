import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LastFactorialDigit m = new LastFactorialDigit();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int T = in.nextInt();

        while(T-- > 0) {
            int N = in.nextInt();
            int res = 1;
            
            for(int i = N; i > 0; i--) {
                res *= i;
            }

            String result = String.valueOf(res);

            System.out.println(result.charAt(result.length()-1));
        }
    }
}