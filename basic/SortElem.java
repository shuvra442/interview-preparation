package basic;

import java.util.Arrays;
import java.util.List;

public class SortElem {
    public static void main(String[] args) {
//        1st approach
        int[] arr={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

//        2nd approach

       int[] arr2= Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr2));
    }
}
