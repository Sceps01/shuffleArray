import java.util.Arrays;
import java.util.Random;

public class shuffleArray {
    static Random random = new Random();

    public static void main(String[] args) {
        int[] array = {5, 3, 4, 2, 1,10,18,11,20};
        System.out.println(Arrays.toString(shuffleArray(array)));
    }

    public static int[] shuffleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = random.nextInt(array.length); // if array run 0 -> index = 0
            int temp = array[randomIndex]; //new temp =>: array[0]
            array[randomIndex] = array[i]; // array[0] => array[0]
            array[i] = temp; //array[0]};
        }
        return array;
    }
}