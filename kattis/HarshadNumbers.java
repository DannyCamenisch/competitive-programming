import java.util.Scanner;

public class HarshadNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HarshadNumbers m = new HarshadNumbers();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int n = in.nextInt();

        while(!isHarshad(n)) {
            n++;
        }

        System.out.println(n);
    }

    private boolean isHarshad(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        
        for(int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        return (n % sum) == 0;
    }
}
