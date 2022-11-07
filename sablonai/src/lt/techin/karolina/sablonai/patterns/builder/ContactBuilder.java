package lt.techin.karolina.sablonai.patterns.builder;

public class ContactBuilder {
    private String name;
    private String surname;
    private String email;
    private String telephone;
    private String address;

    public ContactBuilder name(String name){ // Cia nera konstruktorius
        this.name = name;
        return this;
    }

    public ContactBuilder surname(String surname){ // Cia nera konstruktorius
        this.surname = surname;
        return this;
    }

    public ContactBuilder email(String email){ // Cia nera konstruktorius
        this.email = email;
        return this;
    }

    public ContactBuilder telephone(String telephone){ // Cia nera konstruktorius
        this.telephone = telephone;
        return this;
    }

    public ContactBuilder address(String address){ // Cia nera konstruktorius
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "ContactBuilder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Contact build(){
        return new Contact(this);
    }
}
