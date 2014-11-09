
import java.io.*;
import java.util.*;

/**
 * Created by RaviG on 11/6/2014.
 */
public class MatrixTranspose {
    public static void main(String[] args) {
        Reader in = new Reader();
        int tc, n, m, dg, u, v, d[];
        boolean flag = true;
        Pair[][] edges, eee;
        while(true){
        try {
            n = in.nextInt();
            m = in.nextInt();
        }catch (Exception e){
            break;
        }
       // if(!flag) System.out.println();
            flag=false;
        edges = new Pair[n + 1][];
        eee = new Pair[m + 1][];
        d = new int[m + 1];
        Arrays.fill(d, 0);


        for (int i = 1; i <= n; i++) {
            dg = in.nextInt();
            edges[i] = new Pair[dg];

            if (dg == 0) {
                in.readLine();
                continue;
            }
            for (int j = 0; j < dg; j++) {
                edges[i][j] = new Pair(in.nextInt(), 0);
                d[edges[i][j].x]++;
            }

            for (int j = 0; j < dg; j++) {
                edges[i][j].y = in.nextInt();
            }
        }

        System.out.println(m + " " + n);
        for (int i = 1; i <= m; i++) {
            eee[i] = new Pair[d[i]];
        }
        for (int i = 1; i <= n; i++) {
            int ccc = 0;
            for (int j = 0; j < edges[i].length; j++) {
                eee[edges[i][j].x][--d[edges[i][j].x]] = new Pair(i, edges[i][j].y);
            }
        }

        for (int i = 1; i <= m; i++) {
            System.out.print(eee[i].length);
            for (int j = eee[i].length - 1; j > -1; j--) {
                System.out.print(" " + eee[i][j].x);
            }
            System.out.print("\n");
            for (int j = eee[i].length - 1; j > -1; j--) {
                if (j != eee[i].length - 1) System.out.print(" ");
                System.out.print(eee[i][j].y);
            }
            System.out.println();
        }

    }

    }
}

class Pair{
    int x,y;

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}