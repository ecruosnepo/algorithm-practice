import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    Stack<Integer> stack = new Stack<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringBuilder sb = new StringBuilder();

    int funcCount = Integer.parseInt(br.readLine());

    while(funcCount-- > 0){
      StringTokenizer func = new StringTokenizer(br.readLine());

      switch(func.nextToken()){
        case "push":
          int num = Integer.parseInt(func.nextToken());
          stack.push(num);
          break;
        case "pop":
          if(stack.empty()){
            sb.append(-1).append("\n");
          }else{
            sb.append(stack.pop()).append("\n");
          }
          break;
        case "size":
          sb.append(stack.size()).append("\n");
          break;
        case "empty":
          sb.append(stack.empty()?1:0).append("\n");
          break;
        case "top":
          if(stack.empty()){
            sb.append(-1).append("\n");
          }else{
            sb.append(stack.peek()).append("\n");
          }
          break;
      }
    }

    System.out.println(sb);
  }

}
