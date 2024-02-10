import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int abmul = a*b;
        int minmul = 1;
        int maxdiv = Integer.MIN_VALUE;

        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i==0 && b%i==0 && maxdiv < i){
                maxdiv = i;
            }
        }
        minmul = abmul/maxdiv;
        System.out.println(maxdiv + "\n" + minmul);
    }
}
