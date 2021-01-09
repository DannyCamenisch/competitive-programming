import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TakeTwoStones m = new TakeTwoStones();
        
        while(in.hasNext()) {
          m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
      System.out.println(in.nextInt() % 2 == 1 ? "Alice" : "Bob");
    }
}
