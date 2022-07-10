import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(109, 205, 304, 104, 205);
        System.out.println(maxInt(list));
    }
    public static int maxInt (List<Integer> list) {
        int maxNum = 0;
        int maxIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            int tmp = list.get(i);
            if(tmp > maxNum) {
                maxNum = tmp;
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
