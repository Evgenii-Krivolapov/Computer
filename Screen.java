public class Screen {
    private final int diagonal;
    private final String type;
    private final int weightScreen;

    public Screen (int diagonal, String type, int weightScreen) {
        this.diagonal = diagonal;
        this.type = type;
        this.weightScreen = weightScreen;
    }
    public int getDiagonal (){
        return diagonal;
    }
    public String getType (){
        return type;
    }
    public int getWeightScreen (){
        return weightScreen;
    }
    public Screen setDiagonal (int diagonal){
        return new Screen( diagonal,  type,  weightScreen);
    }
    public Screen setType (String type) {
        return new Screen( diagonal,  type,  weightScreen);
    }
    public Screen setWeightScreen (int weightScreen){
        return new Screen( diagonal,  type,  weightScreen);
    }
    public String toString () {
        return "Экран: " + "\n" +
                "Диагональ: " + diagonal + "\n" +
                "Тип эрана: " + type + "\n" +
                "Вес экрана: " + weightScreen + " грамм. ";
    }
}
