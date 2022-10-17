package lt.techin.karolina.oop;

public class Test {
    private int x; // Class field, kai is public pakeiciam i private

    //    ALT INSERT ->
    public int getX() {

        return x + 10;
    }

    public void setX(int x) {
        if (x < 0) {
            System.out.println("Netinkamas!");
        } else {
            this.x = x;
        }
    }

    //    @ -> nurodymas

    @Override
    public String toString() {
//        return "Test{" +
//                "x=" + x +
//                '}';
        return "x=" + x;
    }

    public boolean equals(Test test) {
        if (this.x == test.getX()) {
            return true;
        } else {
            return false;
        }
    }
}
