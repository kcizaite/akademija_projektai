package lt.techin.karolina.objprogramavimas.phoneBook;

public class MainForTest {
    public static void main(String[] args) {
        User user1 = new User("Karolina", "+37061234567");
        User user2 = new User("Karolina", "+37061234567");
        System.out.println(user1);
        PhoneBook phb = new PhoneBook();
        phb.createUser(user1);
        System.out.println(phb.readUser("Karolina"));
    }
}
