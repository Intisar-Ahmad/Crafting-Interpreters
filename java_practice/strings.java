// package java_practice;

public class strings {
    public static void main(String[] args) {
        String name1 = "bhino";
        String name2 = "iscool";// strings are immutable

        // concatenation
        String fullName = name1 + name2;
        System.out.println(fullName);

        // length
        System.out.println(fullName.length());

        // charAt
        System.out.println(fullName.charAt(3));

        // replace
        System.out.println(fullName.replace(name2, "isverycool"));

        // substring
        System.out.println(fullName.substring(0,3));// the last index is exclusive

        // lowercase and uppercase
        System.out.println(fullName.toLowerCase()+fullName.toUpperCase());

        

    }
}
