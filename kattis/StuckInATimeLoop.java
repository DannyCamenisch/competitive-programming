import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StuckInATimeLoop m = new StuckInATimeLoop();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }

    private void run(Scanner in) {
        int N = in.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.println(i + " Abracadabra");
        }
    }

}