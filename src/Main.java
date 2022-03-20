import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> newList = new ArrayList<>();
        int num;
        for (int i = 0; i < intList.size(); i++) {
            num = intList.get(i);
            if (num > 0 && (num % 2 == 0)) {
                newList.add(num);
            }
        }
        newList.sort(Comparator.naturalOrder());
        System.out.println(newList);
    }
}