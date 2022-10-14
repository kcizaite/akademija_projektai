package lt.techin.karolina.praktikosdiena2;

public class BinaryCode {
    public static void main(String[] args) {
        String text = "I like Java";
        System.out.println("Original: " + text);
        stringToBinary(text);
    }

    public static void stringToBinary(String text) {
        int length = text.length();
        for (int i = 0; i < length; i++) {
            int charValue = Integer.valueOf(text.charAt(i));
            String binaryCode = "";
            while (charValue > 0) {
            }
            if (charValue % 2 == 1) {
                binaryCode += '1';
            } else {
                binaryCode += '0';
            }
        }
//        System.out.println("Binary: " + binaryCode);
    }
}
