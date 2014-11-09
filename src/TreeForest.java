import java.io.*;
import java.util.*;


/**
 * Created by RaviG on 11/6/2014.
 */
public class TreeForest {

    public static void main(String[] args) {
        Reader in = new Reader();
        int tc,node[] = new int[26];
        int cc,e,n;
        String s ;
        char cu,cv,ver[];

        tc = in.nextInt();
        while (0 < tc--){
            Arrays.fill(node,0);
            s = in.nextWord();
            e=0;
            while (s.charAt(0)!='*'){
                node[s.charAt(1)-'A']=1;
                node[s.charAt(3)-'A']=1;
                s = in.nextWord();
                e++;
            }
            cc=0;
            n=0;
            ver = in.nextWord().toCharArray();
            for (int i = 0; i < ver.length; i++) {
                if(node[ver[i]-'A']!=1) cc++;
                n++;
                i++;
            }

            System.out.println("There are "+(n-e-cc)+" tree(s) and "+cc+" acorn(s).");

        }//End of while



    }//End of Main


}//End of Class


class Reader {
private BufferedReader input;
private StringTokenizer line = new StringTokenizer("");

public Reader() {
        input = new BufferedReader(new InputStreamReader(System.in));
        }

public Reader(String s) {
        try {
        input = new BufferedReader(new FileReader(s));
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
        }

public void fill() {
        try {
        if(!line.hasMoreTokens()) line = new StringTokenizer(input.readLine());
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
        }

public double nextDouble() {
        fill();
        return Double.parseDouble(line.nextToken());
        }

public String nextWord() {
        fill();
        return line.nextToken();
        }

public int nextInt() {
        fill();
        return Integer.parseInt(line.nextToken());
        }

public long nextLong() {
        fill();
        return Long.parseLong(line.nextToken());
        }

public double readDouble() {
        double d = 0;
        try {
        d = Double.parseDouble(input.readLine());
        } catch(IOException io) {io.printStackTrace(); System.exit(0);}
        return d;
        }

public int readInt() {
        int i = 0;
        try {
        i = Integer.parseInt(input.readLine());
        } catch(IOException io) {io.printStackTrace(); System.exit(0);}
        return i;
        }

public int[] readInts(int n) {
        int[] a = new int[n];
        for(int i=0; i<n; i++)
        a[i] = nextInt();
        return a;
        }

public void fillInts(int[] a) {
        for(int i=0; i<a.length; i++)
        a[i] = nextInt();
        }

public long readLong() {
        long l = 0;
        try {
        l = Long.parseLong(input.readLine());
        } catch(IOException io) {io.printStackTrace(); System.exit(0);}
        return l;
        }

public String readLine() {
        String s = "";
        try {
        s = input.readLine();
        } catch(IOException io) {io.printStackTrace(); System.exit(0);}
        return s;
        }

public String restStringLine(){
        StringBuilder sb = new StringBuilder();
        int n = line.countTokens();
        for (int i = 0; i < n; i++) {
        sb.append(" ");
        sb.append(line.nextToken());
        }

        if(n==0) return null;
        else return sb.substring(1);

        }

public String nextString(){
        if(!line.hasMoreTokens()) fill();
        return line.nextToken();
        }

public String[] fillString(int n){
        String res[] = new String[n];
        for (int i = 0; i < n; i++) {
        res[i] = nextString();
        }
        return res;
        }

public char[][] fillChars(int n,int m){
        char[][] res = new char[n][m];
        for (int i = 0; i < n; i++) {
        res[i] = nextString().toCharArray();
        }
        return res;
        }

public String next(){
        return nextString();
        }



        }

class Writer {

    private BufferedWriter output;

    public Writer() {
        output = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public Writer(String s) {
        try {
            output = new BufferedWriter(new FileWriter(s));
        } catch(Exception ex) { ex.printStackTrace(); System.exit(0);}
    }

    public void println() {
        try {
            output.append("\n");
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }

    public void print(Object o) {
        try {
            output.append(o.toString());
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }

    public void println(Object o) {
        try {
            output.append(o.toString()+"\n");
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }

    public void printf(String format, Object... args) {
        try {
            output.append(String.format(format, args));
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }

    public void printfln(String format, Object... args) {
        try {
            output.append(String.format(format, args)+"\n");
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }

    public void flush() {
        try {
            output.flush();
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }

    public void close() {
        try {
            output.close();
        } catch(IOException io) { io.printStackTrace(); System.exit(0);}
    }
}