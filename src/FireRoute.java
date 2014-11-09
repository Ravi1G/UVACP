import java.io.*;
import java.util.*;

public class FireRoute {

    public static ArrayList<Integer>[] edged;
    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Reader  in = new Reader();
        int n,m;
        long ways;
        int cc;
        int[] csize,vis;

        int tc = in.nextInt();
        while (0 < tc--) {
         n = in.nextInt();
         m = in.nextInt();
            edged = new ArrayList[n+1];
            for (int i = 1; i <= n; i++) {
                edged[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < m; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                edged[u].add(v);
                edged[v].add(u);
            }

            vis = new int[n+1];
            Arrays.fill(vis, 0);
            cc=1;
            csize = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if(vis[i]==0){
                    csize[cc++] = dfs(i,vis);
                }
            }
            ways = 1l;
            for (int i = 1; i <= cc - 1; i++) {
                ways = (ways*csize[i])%MOD;
            }
            System.out.println(cc-1+" "+ways);

        }//End of While

    }

    public static int dfs(int i,int[] vis){
        int res = 1;
        vis[i] = 1;

        for(int v : edged[i]){
            if(vis[v]==0){
                res+= dfs(v,vis);
            }
        }

        return res;
    }


}
