package basic;

public class RemoveJunk {
    public static void main(String[] args) {
        String str= "@#78348 HIT #@%^*()*&%%#@@$%&* College";
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);}
}
