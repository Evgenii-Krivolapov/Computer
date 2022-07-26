public class RAM {
    private final String type;
    private final int volume;
    private final int weightRAM;

    public RAM (String type, int volume, int weightRAM) {
        this.type = type;
        this.volume = volume;
        this.weightRAM = weightRAM;

    }
    public String getType () {
        return type;
    }
    public int getVolume () {
        return volume;
    }
    public int getWeightRAM () {
        return weightRAM;
    }
    public RAM setType (String type) {
        return new RAM( type,  volume,  weightRAM);
    }
    public RAM setVolume (int volume) {
        return new RAM( type,  volume,  weightRAM);
    }
    public RAM setWeightRAM (int weightRAM) {
        return new RAM( type,  volume,  weightRAM);
    }
    public String toString () {
        return "Оперативная память ПК: " + "\n" +
                "Тип оперативной памяти: " + type + "\n" +
                "Объём оперативной памяти: " + volume + " Gb. " + "\n" +
                "Вес оперативной памяти: " + weightRAM + " грамм. ";

    }
}
