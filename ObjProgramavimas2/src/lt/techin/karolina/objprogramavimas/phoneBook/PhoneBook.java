package lt.techin.karolina.objprogramavimas.phoneBook;

public class PhoneBook {
    private User[] users = new User[100]; // Tik 100 adresu tilps
    private static int userCount = 0;

    //    CRUD
    public void createUser(User user) {
        if (userCount < users.length) {
            users[userCount] = user; // 0 reiskia sarase vieta, ne duomeni kuri ima :)
            userCount++;
        } else {
            System.out.println("Phone Book  is FULL!");
        }
    }

    public User readUser(String userName){
        for (User user:users) {
            if (userName.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }
}
