import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IveBeenEverywhereMan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IveBeenEverywhereMan m = new IveBeenEverywhereMan();
        
        while(in.hasNext()) {
            m.run(in);
        }
        
        in.close();
    }
    
    private void run(Scanner in) {
        int T = in.nextInt();

        while(T-- > 0) {
            int N = in.nextInt();
            Set<String> s = new HashSet<String>();

            while(N-- > 0) {
                s.add(in.next());
            }

            System.out.println(s.size());
        }
    }
}