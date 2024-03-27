package basic;

import java.util.Arrays;

public class SearchingElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int elem = 2;

//        linear search approach
        boolean status = false;
        for (int j : arr) {
            if (j==elem) {
                status = true;
                break;
            }

        }
        if (status) {
            System.out.println(" found");
        } else {
            System.out.println(" not found");
        }

    }
}
