import java.util.*;
import java.io.*;

/**
 * Created by RaviG on 11/7/2014.
 */
public class Rujia {

    public static void main(String[] args) {

        Reader in = new Reader();
        Writer out = new Writer();

        int n,m,k,v;


        while (true) {
            try {
                n = in.nextInt();
                m = in.nextInt();
            } catch (Exception e) {
                break;
            }

            ArrayList<Integer>[] data = new ArrayList[1000001];
            for (int i = 0; i < data.length; i++) {
                data[i] = new ArrayList<Integer>();
            }

            for (int i = 1; i <= n; i++) {
                data[in.nextInt()].add(i);
            }

            for (int i = 0; i < m; i++) {
                k = in.nextInt();
                v = in.nextInt();
                int r = k-1<data[v].size()?data[v].get(k-1):0;
                out.println(r);
            }

        }//End of While
        out.close();
    }
}
