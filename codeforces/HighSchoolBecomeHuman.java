import java.util.Scanner;

public class HighSchoolBecomeHuman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()) {
            int x = in.nextInt();
            int y = in.nextInt();
            
            if(y == x) {
                System.out.println("=");
                continue;
            }

            double z = y * Math.log(x) - x * Math.log(y);

            if(z == 0.0) System.out.println("=");
            else if(z < 0) System.out.println("<");
            else System.out.println(">");
        }

        in.close();
    }
}
