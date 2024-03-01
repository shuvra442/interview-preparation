package basic;

public class CountOccuerenceCharacter {
    public static void main(String[] args) {
        String str="java is best programming language";
        int total_length=str.length();
        int removed_char=str.replace("a","").length();
        System.out.println(total_length-removed_char);
    }
}
