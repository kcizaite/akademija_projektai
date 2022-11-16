package lt.techin.karolina.praktikosdiena.pd16;

import java.util.UUID;
//  Creating a new account with a unique code
public class AccOwner {
    private String customerName;
    public String uniqueID = UUID.randomUUID().toString();

    public AccOwner(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    @Override
    public String toString() {
        return "New account: " + "customer name = " + customerName + ", ID = " + uniqueID;
    }
}
