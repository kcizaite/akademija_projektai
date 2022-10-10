package lt.techin.karolina.algoritmai.algoritmai;
public class CoffeeMaker {

//    3 veiksmas
    private boolean isPaid = false;

//    papildomai ziurime ar cia kazkas veikia tarpe
    {
        System.out.println("Labas");
//          print labas
    }

//    1 veiksmas
//    4 veiksmas is boolean i void, return i isPaid pakeisti
//    Pinigu perdavimas
//    papildomai prie protected desime String name
    public void getMoney(double money, String name){
        if (money > 0.0) {
            this.isPaid = true;
//            7 veiksmas, getMoney ir makeCoffee sujungimas
//            papildomas protected
//            cia buvusi makeCoffee(name); iskelem
        } else {
            makeCoffee(name);
        }
    }

//    2 veiksmas
//    papildomai public darome i protected, String name
    protected void makeCoffee(String name) {
//        5 veiksmas if pridejom ir this visur
        if (this.isPaid) {
            System.out.println("Your coffee in process... ");
        } else {
            System.out.println("No coffe " + name);
        }


    }
}
