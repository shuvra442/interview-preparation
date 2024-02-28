package basic;

import java.util.Arrays;

public class SumOfElem {
    public static void main(String[] args) {
        int []arr={1,2,3};
        int sum=0;
//        1st approach
        for (int i=0;i< arr.length;i++){
             sum = Math.addExact(sum, arr[i]);
        }
        System.out.println(sum);

//        2nd approach
        int arraysSum= Arrays.stream(arr).sum();
        System.out.println(arraysSum);

    }
}
