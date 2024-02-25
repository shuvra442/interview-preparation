package basic;

public class SwapTwoString {
    public static void main(String[] args) {
        String a="Hello";
        String b="World";
        System.out.println("Before the value of a and b :: ");
        System.out.println(a);
        System.out.println(b);

        a=a+b; // append two string === HelloWorld
        b=a.substring(0,a.length()-b.length()); // assign the value of b=hello
        a=a.substring(b.length());

        System.out.println("After the value of a and b :: ");
        System.out.println(a);
        System.out.println(b);

    }
}
