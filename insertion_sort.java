import java.util.*;
public class insertion_sort { 
    public static void insertionsort(int arr[]) {
        for(int i = 1 ; i<arr.length ; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct position to insert
            while(prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void printarr(int arr[]) {
        for(int k = 0; k<arr.length ; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        insertionsort(arr);
        printarr(arr);
    }
}