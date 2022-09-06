package sorting.insertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {4,1,25,21};
        for (int i=1;  i<array.length ; i++){
            int temp = array[i];
            int j = i-1;
            while (j != -1){
                if (temp<array[j]){
                    array[j+1] = array[j];
                } else if (temp>array[j]) {
                    break;
                }
                j--;
            }
            array[j+1] = temp;

        }
        System.out.println(Arrays.toString(array));
    }
}
