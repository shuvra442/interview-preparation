package basic;

import java.util.Arrays;

public class CompareTwoArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {1,2,3,4,5};

        /**
         * 1st approach
         *  boolean status = Arrays.equals(a,b);
         *        if (status){
         *            System.out.println("Array is equal");
         *        } else {
         *            System.out.println("Array is not equal");
         *        }
         */

//        2nd approach
        boolean status = true;
        if(a.length==b.length){
            for(int i=0;i<a.length;i++){
                if (a[i] != b[i]){
                    status = false;
                }
            }
        } else {
            status = false;
        }

        if (status){
            System.out.println("Array is equal");
        } else {
            System.out.println("Is not equal");
        }

    }

}
