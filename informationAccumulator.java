public class informationAccumulator {
    private final String type;
    private final int memory;
    private final int weightHDD;

    public informationAccumulator (String type, int memory, int weightHDD) {
        this.type = type;
        this.memory = memory;
        this.weightHDD = weightHDD;
    }
    public String getType (){
        return type;
    }
    public int getMemory (){
        return memory;
    }
    public int getWieghtHDD (){
        return  weightHDD;
    }
    public informationAccumulator setType (String type){
        return new informationAccumulator( type,  memory,  weightHDD);
    }
    public informationAccumulator setMemory (int memory){
        return new informationAccumulator( type,  memory,  weightHDD);
    }
    public informationAccumulator setWeightHDD (int weightHDD){
        return new informationAccumulator( type,  memory,  weightHDD);
    }
    public String toString (){
        return "Жёсткий диск: " + "\n" +
                "Тип накопителя информации: " + type + "\n" +
                "Объём памяти: " + memory + " Gb. " + "\n" +
                "Вес накопителя: " + weightHDD + " грамм. ";
    }
}
