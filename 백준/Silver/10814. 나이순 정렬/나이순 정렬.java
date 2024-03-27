import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int user = Integer.parseInt(br.readLine());
    String[][] info = new String[user][2];
    for (int i = 0; i < user; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      info[i][0] = st.nextToken();
      info[i][1] = st.nextToken();
    }

//    Arrays.sort(info, (o1, o2) -> {
//      if(o1[0].equals(o2[0])){
//        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
//      }else{
//        return o1[0].compareTo(o2[0]);
//      }
//    });

    Arrays.sort(info, Comparator.comparing(o -> Integer.parseInt(o[0])));

    for(String[] s : info){
      sb.append(s[0]).append(" ").append(s[1]).append("\n");
    }

    System.out.println(sb);
  }
}
