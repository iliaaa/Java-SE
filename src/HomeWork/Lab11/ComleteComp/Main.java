package HomeWork.Lab11.ComleteComp;

public class Main {
    public static void main(String[] args) {
        Motherboard motherboard3 = new Motherboard("chipset", "producer", 3);
        Cpu cpu10 = new Cpu("10hz", "manufacturer");
        HardDrive hardDrive1000 = new HardDrive(1000, "producer");
        Ram ram8 = new Ram(8, "producer");
        Computer computer1 = new Computer();
        Computer computer2 = new Computer(computer1);
        computer1.setMotherboard(motherboard3).setHardDrive(hardDrive1000).setCpu(cpu10).setCompName("govnopeka");
        System.out.println(computer1);
        Computer computer3 = new Computer(cpu10, ram8, hardDrive1000, motherboard3,"onemorepeka");
        System.out.println(computer3);
        Computer computer4 = new Computer(computer3);
        System.out.println(computer4);
    }
}
