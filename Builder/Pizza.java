package designPtrns;

public class Pizza {

    private String tomatoSouce;
    private String mozzarella;
    private String onion;
    private String mushrooms;
    private String olives;
    private String pepperoncini;

    public Pizza(Builder builder) {
        this.tomatoSouce = builder.tomatoSouce;
        this.mozzarella = builder.mozzarella;
        this.onion = builder.onion;
        this.mushrooms = builder.mushrooms;
        this.olives = builder.olives;

    }

    public static class Builder{
        private String tomatoSouce;
        private String mozzarella;
        private String onion;
        private String mushrooms;
        private String olives;

        public Builder(String tomatoSouce, String mushrooms){
            this.tomatoSouce=tomatoSouce;
            this.mushrooms=mushrooms;
        }
        public Builder mozzarella(String mozzarella){
            this.mozzarella=mozzarella;
            return this;
        }
        public Builder onion(String onion){
            this.onion=onion;
            return this;
        }
        public Builder olives(String olives){
            this.olives=olives;
            return this;
        }
        public Pizza build(){
            return new Pizza(this);
        }
    }



    public String getTomatoSouce() {
        return tomatoSouce;
    }

    public String getMozzarella() {
        return mozzarella;
    }

    public String getOnion() {
        return onion;
    }

    public String getMushrooms() {
        return mushrooms;
    }

    public String getOlives() {
        return olives;
    }

    public String getPepperoncini() {
        return pepperoncini;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "tomatoSouce='" + tomatoSouce + '\'' +
                ", mozzarella='" + mozzarella + '\'' +
                ", onion='" + onion + '\'' +
                ", mushrooms='" + mushrooms + '\'' +
                ", olives='" + olives + '\'' +
                ", pepperoncini='" + pepperoncini + '\'' +
                '}';
    }
}
