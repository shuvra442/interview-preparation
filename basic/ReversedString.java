package basic;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReversedString {
    public static void main(String[] args) {
        String str=" Haldia Institute of Technology ";

//        1. using for loop --> basic
        String rev= " ";
        for (int i=str.length()-1;i>=0;i--) {
            rev +=str.charAt(i);
        }
        System.out.println(rev);

//        2. using revered method  --> medium
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

//        3. using stream         -->> advanced
        String reversedString = Stream.of(str)
                .map(string ->new StringBuffer(string).reverse())
                .collect(Collectors.joining());
        System.out.println(reversedString);
    }
}
