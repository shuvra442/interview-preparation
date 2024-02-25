package basic;

public class swapUsingThirdWithoutThird {
    public static void main(String[] args) {
        int a=20, b=30,c;
//        Using third variable
        c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);

//        without using third variable
        a=a+b; //a->30 = a ->30 + b->20 = 50   a-> 50
        b=a-b; //b->20 = a->50 - b->20 = 30    b-> 30
        a=a-b; //a->50 = a->50 - b->30 = 20    a=20
        System.out.println(a);
        System.out.println(b);
    }
}
