import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toLowerCase().toCharArray();

        final int r = 31;
        final int charToNum = 96;
        int result = 0;

        for (int i = 0; i < input.length; i++) {
            result += ((input[i]-charToNum) * (int)Math.pow(r,i));
        }

        System.out.println(result);
    }
}
