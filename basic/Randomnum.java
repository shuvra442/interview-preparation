package basic;


import java.util.Random;

public class Randomnum {
    public static void main(String[] args) {

        Random rand = new Random();
        int num = rand.nextInt(1,100);
        System.out.println(num);
    }
}
