import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());

        TreeSet<Integer> ts = new TreeSet<>();
        while(n-->0){
            ts.add(Integer.parseInt(br.readLine()));
        }

        for (Integer num : ts){
            sb.append(num+"\n");
        }
        
        System.out.print(sb);
    }
}