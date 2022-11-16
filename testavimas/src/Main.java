import java.util.HashSet;
import java.util.Set;

public class Main {

    public static int allCharactersSame(String tekstas){
        Set<Character> s1 = new HashSet<Character>();
        int krepselis = 0;
        for(int i = 0; i < tekstas.length(); i++)
            s1.add(tekstas.charAt(i));
        if (s1.size() == 1){
            krepselis += 10;
        }
        return krepselis;
    }

    public static void main(String[] args) {
        String tekstas = "AAA111";
        String s1a = tekstas.substring(0, (tekstas.length()/2));
        System.out.println(s1a);
        String s1b = tekstas.substring((tekstas.length()/2));
        System.out.println(s1b);


        System.out.println(allCharactersSame("111"));

    }
}