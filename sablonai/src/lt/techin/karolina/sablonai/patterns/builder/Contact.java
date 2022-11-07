package lt.techin.karolina.sablonai.patterns.builder;

public class Contact {
//    PROBLEMA
//    private String name;
//    private String surname;
//    private String email;
//    private String telephone;
//    private String address;
////    Problema, kad labai ilgas konstruktorius
//    public Contact(String name, String surname, String email, String telephone, String address) {
//        this.name = name;
//        this.surname = surname;
//        this.email = email;
//        this.telephone = telephone;
//        this.address = address;
//    }
//
//    public Contact(String name, String telephone) {
//        this.name = name;
//        this.telephone = telephone;
//    }
//    TODEL DAROME:
    private String name;
    private String surname;
    private String email;
    private String telephone;
    private String address;

    Contact(ContactBuilder contactBuilder){ // Kontruktorius
        this.name = contactBuilder.getName();
        this.surname = contactBuilder.getSurname();
        this.email = contactBuilder.getEmail();
        this.telephone = contactBuilder.getTelephone();
        this.address = contactBuilder.getAddress();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
