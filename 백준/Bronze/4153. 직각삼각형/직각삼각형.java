import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] n = new int[3];

    while(true){

      for (int i = 0; i < 3; i++) {
        n[i] = sc.nextInt();
      }

      if(n[0] == 0 && n[1] == 0 && n[2] == 0){
        break;
      }

      Arrays.sort(n);

      if(n[2]*n[2] == n[0]*n[0] + n[1]*n[1]){
        System.out.println("right");
      }else{
        System.out.println("wrong");
      }

    }
    sc.close();
  }
}
