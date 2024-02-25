package basic;

public class CountNumber {
    public static void main(String[] args) {
        int n=1234;
        int s=0;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
