package basic;

import java.util.Arrays;

public class EvenAndOddNumInArray {
    public static void main(String[] args) {
        int []arr={2,3,1,5,6,3,7};
        for (int i=0;i< arr.length;i++){
            if (arr[i]%2==0){
                System.out.println("The even number is :: "+arr[i]);
            }else {
                System.out.println("The odd number is :: "+arr[i]);
            }
        }
        System.out.println("Even number  are :: ");
        Arrays.stream(arr).filter(s -> s%2==0).forEach(System.out::println);
        System.out.println("Odd number are :: ");
        Arrays.stream(arr).filter(s -> s%2!=0).forEach(System.out::println);
    }
}
