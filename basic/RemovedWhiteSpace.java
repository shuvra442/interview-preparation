package basic;

public class RemovedWhiteSpace {
    public static void main(String[] args) {
        String str="    sh uv   ra    ";
        System.out.println(str);
        System.out.println(str.replaceAll("\\s",""));
    }
}
