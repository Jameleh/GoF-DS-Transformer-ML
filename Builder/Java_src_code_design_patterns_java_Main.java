package code_design_patterns.java;

public class Main {

  public static void main(String[] args) {
    Taco taco = new Taco.Builder()
            .meat("Beef")
            .cheese("Tasty")
            .shell("Hard")
            .vegan(false)
            .salad(true)
            .build();
    System.out.print(taco);
  }
}
