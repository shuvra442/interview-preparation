package basic;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElement {
    public static void main(String[] args) {


        String []str = {"Java", "Python","C", "Rubby","Java", "C"};

//      1. using for loop ... worst time complexity --> O(nxn)
        for (int i=0;i < str.length;i++) {
            for (int j=i+1; j<str.length; j++){
                if (str[i].equals(str[j])){
                    System.out.println(str[i]);
                }
            }
        }

//        2. using HashSet --> it contain unique value
//          Time complexity ---> O(N)
        Set<String> store = new HashSet<String>();

        for (String string : str){
            if (store.add(string)==false){
                System.out.println(string);
            }
        }

    }
}
