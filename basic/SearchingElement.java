package basic;

import java.util.Arrays;

public class SearchingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int elem = 10;

//        linear search approach
        boolean status = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                status = true;
            }

        }
        if (status) {
            System.out.println(" found");
        } else {
            System.out.println(" not found");
        }

    }
}
