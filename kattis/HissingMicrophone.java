import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HissingMicrophone m = new HissingMicrophone();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        String s = in.next();

        if(s.contains("ss")) System.out.println("hiss");
        else System.out.println("no hiss");
    }
}
