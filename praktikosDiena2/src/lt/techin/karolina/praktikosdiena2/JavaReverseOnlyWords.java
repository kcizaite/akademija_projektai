package lt.techin.karolina.praktikosdiena2;

public class JavaReverseOnlyWords {
    public static void main(String[] args) {
        String text = "I like Java";
        System.out.println("Original: " + text);

        String[] words = text.split(" ");
        String reversedString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length()-1; j >= 0; j--) {
                System.out.println(i + "xxxx" + j);
                reversedWord = reversedWord + word.charAt(j);
            }
            reversedString = reversedString + reversedWord + " ";
        }
        System.out.println("New: " + reversedString);
    }
}
