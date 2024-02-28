package basic;

import java.util.Arrays;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};

        // 1+2+4+5+6 = 18
        // 1+2+3+4+5+6 = 21     ---> 18-21=3

        int sum1 = Arrays.stream(arr).sum();
        int sum2=0;
        for (int i=0;i<=5;i++){
            sum2 +=i;
        }
        int MissingNumber = Math.subtractExact(sum1,sum2);
        System.out.println("Missing number is :: "+MissingNumber);
    }
}
