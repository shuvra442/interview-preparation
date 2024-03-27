package basic;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPalindrom {
    public static void main(String[] args) {
        String str="Sas";

        /**
         * 1st approach
         */
        StringBuffer sb= new StringBuffer();
        sb.append(str);
        StringBuffer reversed2=sb.reverse();
        System.out.println(reversed2);

        if (reversed2.equals(str)){
            System.out.println("String are equals ");
        } else {
            System.out.println("String are not equals");
        }

        /**
         * 2nd approach
         */

        String reversed = Stream.of(str)
                .map(string->new StringBuffer(string).reverse())
                .collect(Collectors.joining());
        System.out.println(reversed);

        if (reversed.equals(str)){
            System.out.println("Yes its reversed");
        } else {
            System.out.println("its not reversed");
        }
    }
}
