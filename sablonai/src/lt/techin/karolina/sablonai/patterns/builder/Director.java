package lt.techin.karolina.sablonai.patterns.builder;
// Director, nes pagal skaidriu info
public class Director {
    public static void main(String[] args) {
        Contact petras = new ContactBuilder()
                .name("Petras")
                .email("petras@gmail.com")
                .address("grybu gatve 7").build();
        System.out.println(petras);
//        print Contact{name='Petras', surname='null', email='petras@gmail.com', telephone='null', address='grybu gatve 7'}
    }
}
