package lt.techin.karolina.praktikosdiena.pcExample;

public class Processor {
    private int frequency;
    private int cpuThreads;

    public Processor(int frequency, int cpuThreads) {
        this.frequency = frequency;
        this.cpuThreads = cpuThreads;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCpuThreads() {
        return cpuThreads;
    }

    public void setCpuThreads(int cpuThreads) {
        this.cpuThreads = cpuThreads;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "frequency=" + frequency +
                ", cpuThreads=" + cpuThreads +
                '}';
    }
}
