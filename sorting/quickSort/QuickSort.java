package sorting.quickSort;

import java.util.Arrays;

public class QuickSort {

    static int partition(int[] array , int low , int high){
        int pivot = array[high];
        int i=low-1;
        for (int j=low ; j< high ; j++){
            if (array[low] < pivot){
                i++;
                int temp =array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[high];
        array[high] = temp;

        return i;

    }

    static void quickSort(int[] array , int low , int high){
        if (low<high){
            int pivotIndex = partition(array,low,high);

            quickSort(array,low,pivotIndex-1);
            quickSort(array,pivotIndex+1 , high);
        }
    }


    public static void main(String[] args) {
        int[] array = {6,3,5,2,8,9};

        quickSort(array,0,array.length-1);

        System.out.println(Arrays.toString(array));

    }
}
