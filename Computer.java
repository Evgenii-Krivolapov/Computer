public class Computer {
    private final String name;
    private final String vendor;
    public int totalWeight = 0;

    private final Processor processor;
    private final RAM ram;
    private final informationAccumulator informationAccumulator;
    private final Screen screen;
    private final keyboard keyboard;

    public Computer (Processor processor, RAM ram, informationAccumulator informationAccumulator,
                     Screen screen, keyboard keyboard, String name, String vendor) {
        this.processor = processor;
        this.ram = ram;
        this.informationAccumulator = informationAccumulator;
        this.screen = screen;
        this.keyboard = keyboard;
        this.name = name;
        this.vendor =  vendor;
    }

    public String getName (){
        return name;
    }
    public String getVendor () {
        return vendor;
    }
    public int getTotalWeight () {
        totalWeight = processor.getWieghtProcessor() + ram.getWeightRAM() + informationAccumulator.getWieghtHDD() +
                screen.getWeightScreen() + keyboard.getWeightKeyboard();
        return totalWeight;
    }
    public Computer setName (String name){
        return new Computer (processor, ram, informationAccumulator,
                screen, keyboard, name, vendor);
    }
    public Computer setVendor (String vendor){
        return new Computer(processor, ram, informationAccumulator,
                screen, keyboard, name, vendor);
    }
    public void setTotalWeight (int totalWeight) {
        this.totalWeight = totalWeight;
    }
    public String toString () {
        return "Имя: " + name + "\n" +
                "Производитель: " + vendor + "\n" +
                "Общий вес компьютера: " + totalWeight + " грамм";
    }
}
