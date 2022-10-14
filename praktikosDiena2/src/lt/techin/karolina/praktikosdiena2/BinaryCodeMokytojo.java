package lt.techin.karolina.praktikosdiena2;

public class BinaryCodeMokytojo {
    public static void main(String[] args) {
        String text = "I like Java"; // Jeigu pridesime lietuvisku raidziu
        System.out.println("Original: " + text);

        convertStringToBinary(text);
    }

    private static void convertStringToBinary(String text) {
        StringBuilder result = new StringBuilder();
        char[] chars = text.toCharArray();
        for (char oneChar : chars) {
            String binary = Integer.toBinaryString(oneChar);
            String formatted = String.format("%8s", binary); // %16s pakeiciam kai lt norimt raidziu
            String output = formatted.replaceAll(" ", "0");
            result.append(output).append(" ");
        }
        System.out.println("Convert: " + result);
    }

}
