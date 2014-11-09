import java.util.*;
import java.io.*;

/**
 * Created by RaviG on 11/7/2014.
 */
public class DearNeighbours {

    public static void main(String[] args) {
        Reader in = new Reader();
        int i,dg[],n;

        int tc = in.nextInt();
        while (0 < tc--) {

            n = in.nextInt();
            in.restStringLine();
            ArrayList<Integer> list = new ArrayList<Integer>();
            
            for (int j = 1; j <=n; j++) {
                list.add(in.readLine().split(" ").length);
            }
            StringBuilder sb = new StringBuilder();
            int min = Collections.min(list);
            for (int j = 0; j < list.size(); j++) {
               // if(j!=0) System.out.print(" ");
                if(list.get(j)==min) sb.append((j+1)+" ");
            }
            System.out.println(sb.substring(0,sb.length()-1));
            if(tc!=0) in.readLine();
        }//End of While

    }
}
