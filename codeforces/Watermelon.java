import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()) {
            int w = in.nextInt();
            
            if(w == 2 ) {
                System.out.println("NO");
            } else if(w % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }

        in.close();
    }
}