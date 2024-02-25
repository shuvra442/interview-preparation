package basic;

public class CountEvenAndOddNum {
    public static void main(String[] args) {
        int n=4455;
        int evenNum=0;
        int oddNum=0;
        while(n>0){
           int rem =n%10;
            if (rem%2 == 0){
                evenNum++;
            } else {
                oddNum++;
            }
            n=n/10;
        }
        System.out.println(evenNum);
        System.out.println(oddNum);
    }
}
