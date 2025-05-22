public abstract class Maggie
{
 final public void prepareMaggie()
 {
  boilWater();
  addMaggie();
  addMasala();
  addStuffings();
  CheeseOrChicken();
  serve();
 }

public void boilWater()
{
  System.out.println("Boiling water ...");
}
 public void addMaggie()
 {
  System.out.println("Adding Maggie to boiled Water...");
 }

 public void addMasala()
 {
  System.out.println("Adding Maggie Masala...");
 }

 abstract void CheeseOrChicken();

 public void addStuffings()
 {
  System.out.println("Add Stuffings of tomato and onion...");
 }
 public void serve()
 {
  System.out.println("Serve Maggie with coriander...");
 }
} 
