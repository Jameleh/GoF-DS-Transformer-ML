public class Computer {
    private String processor;
    private String memory;
    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
    }
    public static class Builder {
        private String processor;
        private String memory;
        public Builder(String processor, String memory) {
            this.processor = processor;
            this.memory = memory;
        }
        public Computer build() {
            return new Computer(this);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("i7", "16GB")
                .build();
    }
}
