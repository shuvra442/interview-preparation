package basic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] num={1,1,2,3,4,5};

        Set<Integer> store = new HashSet<>();
        for (Integer number: num){
            if (!store.add(number)){
                System.out.println(num[number]);
            }
        }
    }
}
