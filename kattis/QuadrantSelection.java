import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QuadrantSelection m = new QuadrantSelection();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int x = in.nextInt();
        int y = in.nextInt();

        int quad = 1;

        if(x > 0) {
            if(y < 0) quad = 4;
        } else {
            if(y < 0) quad = 3;
            else quad = 2;
        }

        System.out.println(quad);
    }
}