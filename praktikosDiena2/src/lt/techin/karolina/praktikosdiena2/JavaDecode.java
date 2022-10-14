package lt.techin.karolina.praktikosdiena2;

import java.util.Arrays;

public class JavaDecode {
    public static void main(String[] args) {
        int[] code = {66, 101, 115, 116, 32, 112, 97, 115, 115, 119, 111, 114, 100, 32, 105, 110, 32, 116, 104, 101, 32,
                119, 111, 114, 108, 100, 32, 105, 115, 32, 80, 65, 83, 83, 87, 79, 82, 68, 33};
        String fullNewCode = "";
        for (int i = 0; i < code.length; i++) {
//            System.out.println(i);
            int ascii = code[i];
//            System.out.println(ascii);
            char newCode = (char) ascii;
//            System.out.println(newCode);
            fullNewCode += newCode;
        }
        System.out.println("Numbers: " + Arrays.toString(code));
        System.out.println("Code: " + fullNewCode);
    }
}
