import java.util.Scanner;

public class R2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        R2 m = new R2();
        
        while(in.hasNext()) {
          m.run(in);
        }
        
        in.close();
     }
        
     private void run(Scanner in) {
        int r1 = in.nextInt();
        int s = in.nextInt();
        
        int r2 = 2*s-r1;
        
        System.out.println(r2);
    }
}
