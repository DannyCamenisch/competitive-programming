import java.util.Scanner;

public class SolvingForCarrots {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SolvingForCarrots m = new SolvingForCarrots();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int N = in.nextInt();
        int P = in.nextInt();

        System.out.println(P);

        while(!in.hasNextInt() && in.hasNext()) {
            in.next();
        }
    }
}