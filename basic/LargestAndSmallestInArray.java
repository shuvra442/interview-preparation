package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestAndSmallestInArray {
    public static void main(String[] args) {
        int arr[] ={-12,-34,-45,23,45,23,22,10000,23342,5545};
//        int n= arr.length;
//        1. using arrays.sort()
//        Arrays.sort(arr);
//        int min=arr[0];
//        int max=arr[n-1];
//        System.out.println(min);
//        System.out.println(max);

//        2. Using stream
//        int min = Arrays.stream(arr).min().getAsInt();
//        int max = Arrays.stream(arr).max().getAsInt();
//
//        System.out.println(min);
//        System.out.println(max);


//        3.
        int largest = arr[0];
        int smallest = arr[0];

        for (int i=1; i<arr.length;i++){
            if (arr[i] > largest){
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);

    }
}
