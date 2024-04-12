import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int count = Integer.valueOf(st.nextToken());
    int m = Integer.valueOf(st.nextToken());

    st = new StringTokenizer(br.readLine());

    int[] arr = new int[count];
    for (int i = 0; st.hasMoreTokens() ; i++) {
      arr[i] = Integer.valueOf(st.nextToken());
    }

    int result = 0;
    for (int i = 1; i < count; i++) {
      for (int j = i+1; j < count; j++) {
        for (int k = j+1; k < count; k++) {
          int b = arr[i] + arr[j] + arr[k];
          if(b > m){
            continue;
          }else{
            result = Math.max(result, b);
          }
        }
      }
    }

    System.out.println(result);
    
  }
}
