public class keyboard {
    private final String type;
    private final String backlight;
    private final int weightKeyboard;

    public keyboard (String type, String backlight, int weightKeyboard) {
        this.type = type;
        this.backlight = backlight;
        this.weightKeyboard = weightKeyboard;

    }
    public String getType (){
        return type;
    }
    public String getBacklight (){
        return backlight;
    }
    public int getWeightKeyboard (){
        return weightKeyboard;
    }
    public keyboard setType (String type){
        return new keyboard( type,  backlight,  weightKeyboard);
    }
    public keyboard setBlackLight (String backlight){
        return new keyboard( type,  backlight,  weightKeyboard);
    }
    public keyboard setWeightKeyboard (int weightKeyboard){
        return new keyboard( type,  backlight,  weightKeyboard);
    }
    public String toString (){
        return "Клавиатура: " + "\n" +
                "Тип клавиатуры: " + type + "\n" +
                "Наличие подстветки: " + backlight + "\n" +
                "Вес клавиатуры: " + weightKeyboard + " грамм. ";
    }
}
