package sorting.bubbleSort;

import java.util.Arrays;

public class MyLogicBubbleSort {
    public static void main(String[] args) {
        int[] array = {7,8,3,2,5};
        for (int i=0 ;i<array.length-1 ; i++){
            for (int j=0 ; j<array.length-1-i ; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
