public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor(4, 8, "Intel", 100);
        System.out.println(processor);

        System.out.println("");

        RAM ram = new RAM("DDR SDRAM", 32, 100);
        System.out.println(ram);

        System.out.println("");

        informationAccumulator informationAccumulator = new informationAccumulator("HDD", 16, 100);
        System.out.println(informationAccumulator);

        System.out.println("");

        Screen screen = new Screen(1560, "LED", 1000);
        System.out.println(screen);

        System.out.println("");

        keyboard keyboard = new keyboard("Mechanical", "YES", 300);
        System.out.println(keyboard);

        System.out.println("");

        Computer computer = new Computer(processor, ram, informationAccumulator, screen, keyboard,
                "DESKTOP-4OJHCLH", "DELL");
        computer.getTotalWeight();
        System.out.println(computer);
    }
}
