import java.util.Arrays;
import java.util.Random;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[10];
        Random rand = new Random(0);
        for(int i = 0; i < n; i++)
        {
            arr[i] = rand.nextInt(5);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < n; i++)
        {
            int count = 0;
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] == arr[j])count++;
            }
            if(count > 0) System.out.println("Значение %d повторяется %d раз".formatted(arr[i], count));
        }
    }
}