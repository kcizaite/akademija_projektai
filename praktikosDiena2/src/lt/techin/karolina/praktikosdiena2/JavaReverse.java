package lt.techin.karolina.praktikosdiena2;

public class JavaReverse {
    public static void main(String[] args) {
        String text = "I like Java";
        String newText = "";
        char oneCharacter;

        System.out.println("Original: " + text);

        for (int i = 0; i < text.length(); i++) {
            oneCharacter = text.charAt(i);
            System.out.println(oneCharacter);
            newText = oneCharacter + newText;
        }
        System.out.println("Reversed word: " + newText);
    }
}
