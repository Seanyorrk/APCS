

package ArrayListSort;
import java.util.ArrayList;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(3.14);
        list.add(2.71);
        list.add(1.618);
        list.add(0.577);
        
        selectionSort(list);
        
        System.out.println("Sorted list: " + list);
    }
    
    public static void selectionSort(ArrayList<Double> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}
