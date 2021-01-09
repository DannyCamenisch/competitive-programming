import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CakeyMcCakeFace {

    public static void main(String[] args) {        
        Scanner in = new Scanner(System.in);
        CakeyMcCakeFace m = new CakeyMcCakeFace();
        
        while (in.hasNext()) {
            m.run(in);
        }

        in.close();
    }

    private void run(Scanner in) {
        int N = in.nextInt();
        int M = in.nextInt();
        
        int[] n = new int[N];
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < N; i++) {
            n[i] = in.nextInt();
        }
        
        
        for(int j = 0; j < M; j++) {
            int m = in.nextInt();
            
            for(int i = 0; i < N; i++) {
                int diff = m - n[i];
                
                if(diff >= 0) {
                    if(map.get(diff) == null) {
                        map.put(diff, 1);
                    } else {
                        map.put(diff, map.get(diff) + 1);
                    }
                }
            }
        }

        int res = 0;
        int best = 0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (best < entry.getValue() ||
            (best == entry.getValue() && res > entry.getKey())) {
            best = entry.getValue();
            res = entry.getKey();
            }
        }
        
        System.out.println(res);
    }
    
}
