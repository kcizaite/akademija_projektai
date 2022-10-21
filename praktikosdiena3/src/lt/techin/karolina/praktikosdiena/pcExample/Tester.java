package lt.techin.karolina.praktikosdiena.pcExample;

public class Tester {
    private boolean isTested;

    public void computerTested(Computer computer) {
        testCpu(computer);
        testMemory(computer);
        testDisk(computer);
        System.out.println("Your computer tested: " + isTested);
    }

    private void testCpu(Computer computer) {
        if (computer.getCpu() != null
                && computer.getCpu().getFrequency() > 1000
                && computer.getCpu().getCpuThreads() >= 2) {
            isTested = true;
        } else {
            isTested = false;
        }
    }

    private void testMemory(Computer computer) {
        if (computer.getRam() != null
                && computer.getRam().getCapacity() > 4096
                && computer.getRam().getFrequency() > 1000) {
            isTested = true;
        } else {
            isTested = false;
        }
    }

    private void testDisk(Computer computer) {
        if (computer.getHdd() != null
                && computer.getHdd().getCapacity() > 100
                && computer.getHdd().getDiscType().equals("SSD")) {
            isTested = true;
        } else {
            isTested = false;
        }
    }
}
