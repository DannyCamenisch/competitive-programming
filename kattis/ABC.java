import java.util.Arrays;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ABC m = new ABC();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int[] n = new int[3];

        for(int i = 0; i < 3; i++) {
            n[i] = in.nextInt();
        }

        Arrays.sort(n);

        String abc = in.next();

        for(int i = 0; i < 3; i++) {
            switch(abc.charAt(i)) {
                case 'A':
                    System.out.print(n[0]);
                    break;
                case 'B':
                    System.out.print(n[1]);
                    break;
                case 'C':
                    System.out.print(n[2]);
                    break;
            }
            if(i != 2) System.out.print(" ");
        } 

        System.out.println();
    }
}
