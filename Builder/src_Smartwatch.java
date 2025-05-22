public class Smartwatch {

  private   int RAM;
  private  int storage;
  private   boolean waterproof;
    private  int weight;
    private   boolean NFC;
    private double price;

    public Smartwatch(Builder builder){
        this.RAM= builder.RAM;
        this.storage=builder.storage;
        this.waterproof=builder.waterproof;
        this.weight=builder.weight;
        this.NFC=builder.NFC;
        this.price= builder.price;

    }

    @Override
    public String toString() {
        return "Smartwatch{" +
                "RAM=" + RAM +"MB"+
                ", storage=" + storage +"GB"+
                ", waterproof=" + waterproof +
                ", weight=" + weight +"grams"+
                ", NFC=" + NFC +
                ", price=" + price +
                '}';
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isNFC() {
        return NFC;
    }

    public void setNFC(boolean NFC) {
        this.NFC = NFC;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    static class Builder{

        private   int RAM;
        private int storage;
        private   boolean waterproof;
        private  int weight;
        private   boolean NFC;
        private double price;

        public Smartwatch build(){
            Smartwatch smartwatch=new Smartwatch(this);
            return smartwatch;
        }

        public int getStorage() {
            return storage;
        }

        public void setStorage(int storage) {
            this.storage = storage;
        }

        public boolean isWaterproof() {
            return waterproof;
        }

        public void setWaterproof(boolean waterproof) {
            this.waterproof = waterproof;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public boolean isNFC() {
            return NFC;
        }

        public void setNFC(boolean NFC) {
            this.NFC = NFC;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }



        public int getRAM() {
            return RAM;
        }

        public void setRAM(int RAM) {
            this.RAM = RAM;
        }

        public Builder(int RAM, int storage){
this.RAM=RAM;
this.storage=storage;

        }

        @Override
        public String toString() {
            return "Builder{" +
                    "RAM=" + RAM +"MB"+
                    ", storage=" + storage +"GB"+
                    ", waterproof=" + waterproof +
                    ", weight=" + weight +"grams"+
                    ", NFC=" + NFC +
                    ", price=" + price +
                    '}';
        }
    }

}
