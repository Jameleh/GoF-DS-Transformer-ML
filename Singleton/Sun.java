public final class Sun {
    private static Sun instance;
    public String value;

    private Sun (String value){
        this.value = value;
    }
    public static Sun getInstance(String value){
        if(instance == null){
            instance = new Sun(value);
        }
        return instance;
    }

}
