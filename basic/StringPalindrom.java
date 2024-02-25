package basic;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringPalindrom {
    public static void main(String[] args) {
        String str="Sas";

        String reversed = Stream.of(str)
                .map(string->new StringBuffer(string).reverse())
                .collect(Collectors.joining());
        System.out.println(reversed);

        if (reversed.equalsIgnoreCase(str)){
            System.out.println("Yes its reversed");
        } else {
            System.out.println("its not reversed");
        }
    }
}
