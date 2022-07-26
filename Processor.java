public class Processor {

    private final int cpuFrequency;
    private final int kolichestvoYader;
    private final String manufacturer;
    private final int weightProcessor;

    public Processor (int cpuFrequency, int kolichestvoYader, String manufacturer, int weightProcessor) {
        this.cpuFrequency = cpuFrequency;
        this.kolichestvoYader = kolichestvoYader;
        this.manufacturer = manufacturer;
        this.weightProcessor = weightProcessor;
    }

    public int getCpuFrequency () {
        return cpuFrequency;
    }
    public int getKolichestvoYader () {
        return kolichestvoYader;
    }
    public String getManufacturer () {
        return manufacturer;
    }
    public int getWieghtProcessor () {
        return weightProcessor;
    }
    public Processor setCpuFrequency (int cpuFrequency){
        return new Processor( cpuFrequency, kolichestvoYader, manufacturer, weightProcessor);
    }
    public Processor setKolichestvoYader (int kolichestvoYader) {
        return new Processor( cpuFrequency,  kolichestvoYader, manufacturer,  weightProcessor);
    }
    public Processor setManufacturer (String manufacturer) {
        return new Processor( cpuFrequency,  kolichestvoYader, manufacturer, weightProcessor);
    }
    public Processor setWeightProcessor (int weightProcessor) {
        return new Processor(cpuFrequency, kolichestvoYader, manufacturer, weightProcessor);
    }
    public String toString () {
        return "Процессор: " + "\n" +
                "Частота: " + cpuFrequency + "\n" +
                "Количество ядер: " + kolichestvoYader + "\n" +
                "Производитель: " + manufacturer + "\n" +
                "Вес процессора: " + weightProcessor + " грамм. ";
    }
}
