package basic;

public class StringManupulation {
    public static void main(String[] args) {
//        1 How to find length of the string  ->> using length()
        String str="I'm so hungry give me some food";
        System.out.println(str.length());

//        2. How to find specific character of a string
        System.out.println(str.indexOf("s"));

//        3. find the second occurrence ofa string
        System.out.println(str.indexOf("s",str.indexOf("s")+1));

//        trim
        String s= "   hello_world  ";
        System.out.println(s.trim());

//        string concat

        System.out.println(s.concat("shu"));

        String date = "01-01-2024";
        System.out.println(date.replace("-","/"));

        String str11= "Do you have money";
        String str12= "Do you have money";
        String str13= "Do you Have money";

        System.out.println(str11.equals(str12)); // true
        System.out.println(str11.equals(str13)); // flase
        System.out.println(str11.equalsIgnoreCase(str13)); // true
    }
}
