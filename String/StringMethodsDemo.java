package String;

public class StringMethodsDemo {
    public static void main(String[] args) {

        // length -> counts the number of characters in the string
        String s = "Yash";
        System.out.println("length(): " + s.length()); // 4

        // charAt -> gives the character at given index
        System.out.println("charAt(1): " + s.charAt(1)); // a

        // codePointAt -> gives ASCII value of the character at given index
        System.out.println("codePointAt(1): " + s.codePointAt(1)); // 97

        // contains -> checks if the string contains given set of characters
        s = "Vaishnavi";
        System.out.println("contains(\"bh\"): " + s.contains("bh")); // false
        System.out.println("contains(\"sh\"): " + s.contains("sh")); // true

        // equals -> checks for equality of 2 strings (case sensitive)
        s = "Java";
        System.out.println("equals(\"C++\"): " + s.equals("C++")); // false
        System.out.println("equals(\"Java\"): " + s.equals("Java")); // true

        // equalsIgnoreCase -> checks equality ignoring case
        System.out.println("equalsIgnoreCase(\"C++\"): " + s.equalsIgnoreCase("C++")); // false
        System.out.println("equalsIgnoreCase(\"Java\"): " + s.equalsIgnoreCase("Java")); // true
        System.out.println("equalsIgnoreCase(\"JAVA\"): " + s.equalsIgnoreCase("JAVA")); // true

        // startsWith -> checks if the string starts with given characters
        System.out.println("startsWith(\"Ja\"): " + s.startsWith("Ja")); // true
        System.out.println("startsWith(\"Ab\"): " + s.startsWith("Ab")); // false

        // endsWith -> checks if the string ends with given characters
        System.out.println("endsWith(\"va\"): " + s.endsWith("va")); // true
        System.out.println("endsWith(\"sm\"): " + s.endsWith("sm")); // false

        // indexOf -> gives the index of a character in the string
        System.out.println("indexOf('v'): " + s.indexOf('v')); // 2

        // lastIndexOf -> gives the last index of a character in the string
        System.out.println("lastIndexOf('a'): " + s.lastIndexOf('a')); // 3

        // replace -> replaces old characters with new ones
        System.out.println("replace('a','@'): " + s.replace('a', '@')); // J@v@
        System.out.println("replace('y','$'): " + s.replace('y', '$')); // Java (unchanged)

        // substring -> extracts part of the string based on indices
        s = "international";
        System.out.println("substring(5,13): " + s.substring(5, 13)); // national
        System.out.println("substring(10): " + s.substring(10)); // nal

        // repeat -> repeats the string given number of times
        s = "Omkar";
        System.out.println("repeat(3): " + s.repeat(3)); // OmkarOmkarOmkar

        // concat -> joins two strings
        s = "Success";
        System.out.println("concat(\"fully\"): " + s.concat("fully")); // Successfully

        // trim -> removes leading and trailing spaces
        s = "        Java        Developer         ";
        System.out.println("trim(): '" + s.trim() + "'"); // 'Java        Developer'

System.out.println("------------------------------------------");

        // split -> splits the string using a delimiter
        s = "I am Java developer";
        String[] m = s.split("a");
        System.out.println("split by 'a':");
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]);
        }

System.out.println("------------------------------------------");
        
        System.out.println("StringBuilder: ");
        // StringBuilder -> makes strings mutable
        StringBuilder sb = new StringBuilder("Java");

        // delete -> deletes characters between given indices
        System.out.println("delete(1,3): " + new StringBuilder("Java").delete(1, 3)); // Ja

        // deleteCharAt -> deletes a single character at given index
        System.out.println("deleteCharAt(2): " + new StringBuilder("Java").deleteCharAt(2)); // Jaa

        // insert -> inserts a string at given index
        System.out.println("insert(2,\"C++\"): " + new StringBuilder("Java").insert(2, "C++")); // JaC++va

        // append -> adds text at the end
        System.out.println("append(\"Developer\"): " + sb.append("Developer")); // JavaDeveloper

System.out.println("------------------------------------------");
    }
}
