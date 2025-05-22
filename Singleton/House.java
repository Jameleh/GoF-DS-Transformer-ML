public class House {
    private String type;
    private int bedrooms;
    private int bathrooms;
    private boolean hasGarage;
    private House(Builder builder) {
        this.type = builder.type;
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
    }
    public static class Builder {
        private String type;
        private int bedrooms;
        private int bathrooms;
        private boolean hasGarage;
        public Builder(String type, int bedrooms) {
            this.type = type;
            this.bedrooms = bedrooms;
        }
        public Builder bathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }
        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }
        public House build() {
            return new House(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        House house = new House.Builder("Single-Family", 3)
                .bathrooms(2)
                .hasGarage(true)
                .build();
        System.out.println("House: " + house.toString());
    }
}
