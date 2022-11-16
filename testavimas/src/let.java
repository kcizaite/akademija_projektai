public class let {
    public static void main(String[] args) {
        char ch1, ch2, ch3;
        // Assign the values to ch1, ch2 and ch3.
        ch1 = 'A';
        ch2 = '9';
        ch3 = 'e';
        // Create three boolean primitives b1, b2 and b3;
        boolean b1, b2, b3;
        // Check whether ch1, ch2 and ch3 are letters or not and assign the results to b1, b2 and b3.
        b1 = Character.isLetter(ch1);
        b2 = Character.isLetter(ch2);
        b3 = Character.isLetter(ch3);

        String str1 = "The character "+ch1 + " is a letter: " + b1;
        String str2 = "The character "+ch2 + " is a letter: " + b2;
        String str3 = "The character "+ch3 + " is a letter: " + b3;

        // Print the values of b1, b2 and b3.
        System.out.println( str1 );
        System.out.println( str2 );
        System.out.println( str3 );
    }
}
