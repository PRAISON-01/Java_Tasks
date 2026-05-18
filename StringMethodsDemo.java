public class StringMethodsDemo {
    public static void main(String[] args) {

        // length() → number of characters
        String a = "Java";
        System.out.println(a.length()); // 4

        // charAt(i) → character at index i
        System.out.println(a.charAt(1)); // 'a'

        // substring(start,end) → part of string
        String b = "Programming";
        System.out.println(b.substring(0, 6)); // "Progra"

        // equals() → compare content
        String c1 = "hello";
        String c2 = "hello";
        System.out.println(c1.equals(c2)); // true

        // equalsIgnoreCase() → ignore case
        System.out.println("Java".equalsIgnoreCase("java")); // true

        // compareTo() → order compare
        System.out.println("apple".compareTo("banana")); // negative

        // indexOf() → first position
        String d = "banana";
        System.out.println(d.indexOf('a')); // 1

        // toUpperCase / toLowerCase → change case
        String e = "adrian";
        System.out.println(e.toUpperCase()); // ADRIAN
        System.out.println("JAVA".toLowerCase()); // java

        // trim() → remove edge spaces
        String f = "   hello   ";
        System.out.println(f.trim()); // "hello"

        // replace(old,new) → replace chars
        String g = "java";
        System.out.println(g.replace('a', 'o')); // jovo

        // contains() → check substring
        String h = "I love Java";
        System.out.println(h.contains("Java")); // true

        // startsWith / endsWith → check start/end
        System.out.println(h.startsWith("I")); // true
        System.out.println(h.endsWith("Java")); // true

        // split(" ") → split by space
        String i = "one two three";
        String[] words = i.split(" ");
        System.out.println(words[0]); // one

        // split(",") → split by comma
        String i2 = "one,two,three";
        String[] parts = i2.split(",");
        System.out.println(parts[1]); // two

        // isEmpty() → no characters
        // isBlank() → empty or spaces
        String j = "";
        String k = "   ";
        System.out.println(j.isEmpty()); // true
        System.out.println(k.isBlank()); // true

        // matches(regex) → pattern check
        String l = "abc123";
        System.out.println(l.matches("[a-z]+\\d+")); // true

        // toCharArray() → string → char[]
        char[] arr = "code".toCharArray();
        System.out.println(arr[0]); // c

        // join() → join with delimiter
        String m = String.join("-", "A", "B", "C");
        System.out.println(m); // A-B-C

        // repeat(n) → repeat string
        System.out.println("ha".repeat(3)); // hahaha

        // valueOf() → convert to string
        int num = 10;
        String n = String.valueOf(num);
        System.out.println(n); // "10"

        // format() → formatted string
        String name = "Adrian";
        int age = 17;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // Character checks
        char ch = 'A';
        System.out.println(Character.isAlphabetic(ch)); // letter?
        System.out.println(Character.isDigit('5')); // number?
        System.out.println(Character.isLetterOrDigit('a')); // letter/number?
        System.out.println(Character.toUpperCase('b')); // B
        System.out.println(Character.toLowerCase('Z')); // z
    }
}
