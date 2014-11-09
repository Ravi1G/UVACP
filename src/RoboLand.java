import java.io.*;
import java.util.*;

/**
 * Created by RaviG on 11/9/2014.
 */
public class RoboLand {
    public static void main(String[] args) {
        Reader in = new Reader();
        int n,m,s,cc;
        DIR curr=null;
        char fild[][],dr;
        //String ttt = "*#."
        while (true) {
            n = in.nextInt();
            m = in.nextInt();
            s = in.nextInt();
            if(n+m+s==0) break;
            int x,y,sx=0,sy=0;
            fild = new char[n][m];

            for (int i = 0; i < n; i++) {
                fild[i] = in.nextString().toCharArray();
                for (int j = 0; j < m; j++) {
                    if(fild[i][j]!='*' && fild[i][j]!='.' && fild[i][j]!='#'){
                        sx = i; sy = j;
                        curr = getDir(fild[i][j]);
                    }
                }
            }

            cc=0;
            char direction[] = in.nextString().toCharArray();
            int nx,ny;
            for (char dd : direction){
                switch (dd){
                    case 'D':
                        curr = curr.turn(1);
                    break;

                    case 'E':
                        curr = curr.turn(0);

                    break;

                    case 'F':
                        nx = sx +curr.x; ny = sy +curr.y;
                        if(nx<0 || ny<0 || nx>=n ||ny>=m || fild[nx][ny]=='#') break;

                        if(fild[nx][ny]=='*'){ cc++; fild[nx][ny]='.';}

                        sx = nx; sy = ny;

                    break;

                }
            }

            System.out.println(cc);
        }//End of While
    }

    public static DIR getDir(char c){
        switch (c){
            case 'N':
                return DIR.N;


            case 'S':
                return DIR.S;


            case 'L':
                return DIR.L;


            case 'O':
                return DIR.O;

        }
        return null;
    }

}

enum DIR{
    N (-1,0), S(1,0) , L(0,1) , O(0,-1);
    public final int x,y;
    DIR(int x,int y){
        this.x = x;
        this.y = y;
    }

    public DIR turn(int d){
        switch (this){
            case N:
                if(d==0)return DIR.O;
                else return DIR.L;


            case S:
                if(d==0)return DIR.L;
                else return DIR.O;


            case L:
                if(d==0)return DIR.N;
                else return DIR.S;


            case O:
                if(d==0)return DIR.S;
                else return DIR.N;

        }
        return null;
    }

}