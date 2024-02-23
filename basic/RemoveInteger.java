package basic;

public class RemoveInteger {
    public static void main(String[] args) {
        long num = 12345;
//        Format 1
        long rev = 0;
        while(num !=0){
            rev = rev * 10 + num % 10;
            num /=10;
        }
        System.out.println(rev);

//        advanced method
        long num1 = 12345;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
    }
}
