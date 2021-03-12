package main;

public class Main {
    public static int binarySearch(int[] array, int l, int r, int element){
        int mid;
        while(l<=r){
            mid=l+(r-l)/2;
            if(array[mid]==element) return mid;
            else
            if(array[mid]<element) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }


}
