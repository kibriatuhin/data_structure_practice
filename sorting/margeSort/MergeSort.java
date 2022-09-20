package sorting.margeSort;

import java.util.Arrays;

public class MergeSort {

    public static void conquer(int[] array , int st,int mid, int ed) {
        int[] merged = new int[ed-st+1];
        int idx = st;
        int idx2 = mid+1;
        int x =0;
        while (idx <= mid && idx2 <=ed){
            if (array[idx] <= array[idx2]){
                merged[x++] = array[idx++];
            }else {
                merged[x++] = array[idx2++];
            }
        }
        while (idx <= mid){
            merged[x++] = array[idx++];
        }
        while (idx2 <= ed){
            merged[x++] = array[idx2++];
        }

        for (int i=0 , j=st ; i<merged.length ; i++,j++){
            array[j] = merged[i];
        }

    }

    public static void divide(int[] array , int st, int ed){
        //base case
        if (st >= ed){
            return;
        }
        int mid = st + (ed - st)/2;
        divide(array,st,mid);
        divide(array,mid+1,ed);
        conquer(array,st,mid,ed);

    }
    public static void main(String[] args) {
       int[] array = {6,3,9,5,2,8};
       int n = array.length;
       divide(array,0,n-1);
        System.out.println(Arrays.toString(array));
    }
}
