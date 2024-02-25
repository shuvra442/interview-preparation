package basic;

public class FindLargetNum {
    public static void main(String[] args) {
        int a=10,b=20,c=30;
        int largest = Math.max(a, b);
        largest = Math.max(largest, c);
        System.out.println(largest);
    }
}
