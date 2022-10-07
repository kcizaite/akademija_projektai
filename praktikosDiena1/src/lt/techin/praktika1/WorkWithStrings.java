// TRIM, SUBSTRING, SPLIT, STRINGTOKENIZER, REPLACE, JOIN, STRIP
package lt.techin.praktika1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class WorkWithStrings {
    public static void main(String[] args) {
        String str1 = "    Hello, World!    ";
        System.out.println(str1); // print     Hello, World!
//        String trim method (nuims neriekalingus whitespace'us pries ir po teksto)
        String formatted = str1.trim();
        System.out.println(formatted); // print Hello, World!
//        Kai reikia isimti informacija - substringus
        String str2 = "Java is okey";
        String cut1 = str2.substring(8);
        System.out.println(cut1); // print okey
        String cut2 = str2.substring(5, 10);
        System.out.println(cut2); // print is ok
//        String split
        String csvFile = "Java;C++;Python;Assembler;Algol";
        String[] data = csvFile.split(";");
//        System.out.println(data); // print [Ljava.lang.String;@2133c8f8
        System.out.println(Arrays.toString(data)); // print [Java, C++, Python, Assembler, Algol]
//        StringTokenizer atitikmuo splitui
        StringTokenizer tokens = new StringTokenizer(csvFile, ";");
//        System.out.println(tokens); // print java.util.StringTokenizer@43a25848
        while (tokens.hasMoreElements()) {
            System.out.println(tokens.nextToken());
        }
//        print
//        Java
//        C++
//        Python
//        Assembler
//        Algol
        System.out.println(csvFile.charAt(5)); // print C
//        Replace
        String result = csvFile.replaceAll("a", " ");
        System.out.println(result); // print J v ;C++;Python;Assembler;Algol
        String result2 = csvFile.toLowerCase().replaceAll("a", " ");
        System.out.println(result2); // print j v ;c++;python; ssembler; lgol
//        Join (pvz. nera)
//        Strip, nesiskiria nuo trim
        String str3 = "    Hello, World!    Labas       ";
        System.out.println(str3.strip()); // print Hello, World!    Labas

    }
}
