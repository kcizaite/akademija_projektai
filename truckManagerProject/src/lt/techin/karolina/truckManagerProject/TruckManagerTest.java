package lt.techin.karolina.truckManagerProject;

import lt.itakademija.exam.TruckManager;
import lt.itakademija.exam.test.BaseTest;

public class TruckManagerTest extends BaseTest {
    @Override
    protected TruckManager createTransportManager() {
        return new TruckManagerImpl();
    }
}
