import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Planina m = new Planina();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int n = in.nextInt();
        int squares = (int) Math.pow(4, n);
        int sum = (int) (squares + Math.sqrt(squares) * 2 + 1);

        System.out.println(sum);
    }
}
