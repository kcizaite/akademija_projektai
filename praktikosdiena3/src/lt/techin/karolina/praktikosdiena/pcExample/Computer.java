package lt.techin.karolina.praktikosdiena.pcExample;

public abstract class Computer {
    Processor cpu;
    Memory ram;
    Storage hdd;

    public Computer(Processor cpu, Memory ram, Storage hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Processor getCpu() {
        return cpu;
    }

    public void setCpu(Processor cpu) {
        this.cpu = cpu;
    }

    public Memory getRam() {
        return ram;
    }

    public void setRam(Memory ram) {
        this.ram = ram;
    }

    public Storage getHdd() {
        return hdd;
    }

    public void setHdd(Storage hdd) {
        this.hdd = hdd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", hdd=" + hdd +
                '}';
    }
}
