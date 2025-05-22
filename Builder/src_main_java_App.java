/**
 * @Author Murat Çelik on Eki, 2021
 */
public class App {

    public static void main(String[] args) {
      Hero mage = new Hero.Builder(Profession.MAGE, "Riobard")
              .withHairColor(HairColor.BLACK)
              .withWeapon(Weapon.DAGGER)
              .build();
        System.out.println(mage);

        Hero thief = new Hero.Builder(Profession.THIEF, "Desmond")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build();
        System.out.println(thief);

        Hero warrior = new Hero.Builder(Profession.WARRIOR, "Amberjill")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .build();
        System.out.println(warrior);
    }

}
