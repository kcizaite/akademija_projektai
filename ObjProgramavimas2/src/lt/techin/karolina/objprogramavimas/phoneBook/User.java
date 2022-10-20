package lt.techin.karolina.objprogramavimas.phoneBook;

public class User {
    private String name;
    private String phoneNumber;

    //    Konstruktorius (instrukcija, kaip daryti)
    public User(String name, String phoneNumber) {
//        this.name = name; // this = nuoroda
//        this.phoneNumber = phoneNumber;
        setName(name);
        setPhoneNumber(phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Patikrinimas, kad obj nebutu sukurtas neteisingai (vardas, numeris siuo atveju)
        if (name == null || name.equals("")) {
            System.out.println("Bad name or name is null ...");
        } else {
            this.name = name;
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.equals("")) {
            System.out.println("Bad phone number or phone number is null ...");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }
//    ALT INSERT toString()
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
