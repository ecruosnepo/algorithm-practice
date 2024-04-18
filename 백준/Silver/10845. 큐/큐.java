import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) throws IOException {

    Queue<Integer> queue = new LinkedList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int funcCount = Integer.parseInt(br.readLine());

    while(funcCount-- > 0){
      StringTokenizer func = new StringTokenizer(br.readLine());

      switch(func.nextToken()){
        case "push":
          int num = Integer.parseInt(func.nextToken());
          queue.add(num);
          break;
        case "pop":
          if(queue.isEmpty()){
            sb.append(-1).append("\n");
          }else{
            sb.append(queue.poll()).append("\n");
          }
          break;
        case "size":
          sb.append(queue.size()).append("\n");
          break;
        case "empty":
          sb.append(queue.isEmpty()?1:0).append("\n");
          break;
        case "front":
          if(queue.isEmpty()){
            sb.append(-1).append("\n");
          }else{
            sb.append(queue.peek()).append("\n");
          }
          break;
        case "back":
          if(queue.isEmpty()){
            sb.append(-1).append("\n");
          }else{
            Object arr = queue.toArray()[queue.size()-1];
            sb.append(arr).append("\n");
          }
          break;
      }
    }

    System.out.println(sb);
  }

}
