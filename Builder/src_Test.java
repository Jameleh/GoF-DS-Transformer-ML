public class Test {

    public static void main(String[] args) {
        Smartwatch.Builder builder=new Smartwatch.Builder(512,4);
  Smartwatch smartwatch= builder.build();
        System.out.println(smartwatch);
        builder.setNFC(true);
        builder.setWaterproof(false);
        builder.setPrice(5000.00);
        builder.setWeight(67);
        System.out.println(builder);
    }
}
