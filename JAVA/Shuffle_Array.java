import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle_Array {

    public static void shuffleArray(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int element : array) {
            list.add(element);
        }

        Collections.shuffle(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+", ");
        }
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        shuffleArray(array);
    }
}