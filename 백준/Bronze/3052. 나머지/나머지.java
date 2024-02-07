import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        int difference;

        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(br.readLine())%42;
        }

        difference = Arrays.stream(nums).distinct().toArray().length;

        System.out.println(difference);        
//        if(difference == 1){
//            System.out.print("모든 수를 42로 나눈 나머지는 "+nums[0]+"이다.");
//        }else if(difference == 10){
//            System.out.println("각 수를 42로 나눈 나머지는 "+Arrays.toString(nums).replaceAll("\\[","").replaceAll("\\]","")+"이다.");
//        }else
//            System.out.print("각 수를 42로 나눈 나머지는 "+Arrays.toString(nums).replaceAll("\\[","").replaceAll("\\]","")+"이다. 서로 다른 값은 "+difference+"개가 있다.");
    }
}
