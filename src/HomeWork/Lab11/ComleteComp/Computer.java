package HomeWork.Lab11.ComleteComp;

public class Computer {
    private Cpu cpu;
    private Ram ram;
    private HardDrive hardDrive;
    private Motherboard motherboard;
    private String compName;

    public Computer() {
    }

    public Computer(Motherboard motherboard, String compName) {
        this.motherboard = motherboard;
        this.compName = compName;
    }

    public Computer(HardDrive hardDrive, Motherboard motherboard, String compName) {
        this(motherboard, compName);
        this.hardDrive = hardDrive;
    }

    public Computer(Ram ram, HardDrive hardDrive, Motherboard motherboard, String compName) {
        this(hardDrive, motherboard, compName);
        this.ram = ram;
    }

    public Computer(Cpu cpu, Ram ram, HardDrive hardDrive, Motherboard motherboard, String compName) {
        this(ram, hardDrive, motherboard, compName);
        this.cpu = cpu;
    }

    public Computer(Computer computer) {
        this.cpu = computer.cpu;
        this.ram = computer.ram;
        this.hardDrive = computer.hardDrive;
        this.motherboard = computer.motherboard;
        this.compName = "Other " + computer.compName;
    }

    public Computer setCpu(Cpu cpu) {
        this.cpu = cpu;
        return this;
    }

    public Computer setRam(Ram ram) {
        this.ram = ram;
        return this;
    }

    public Computer setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
        return this;
    }

    public Computer setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public Computer setCompName(String compName) {
        this.compName = compName;
        return this;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public String getCompName() {
        return compName;
    }

    @Override
    public String toString() {
        return "======================" +
                "\nComputer: " + compName +
                "\n\ncpu: " + cpu +
                "; \n\nram: " + ram +
                "; \n\nhardDrive: " + hardDrive +
                "; \n\nmotherboard: " + motherboard +
                "; \n" +
                "=====================";
    }
}
