package main.java.designPattern;


public class Main {

    public static void main(String[] args) {
        System.out.println("hello OOP-Builder");

        Hero heroOne=new Hero.Builder()
                .name("heroOne")
                .hairColor(HairColor.RED)
                .build();
        System.out.println(heroOne.getName());

        Hero hero = new Hero.Builder()
                .armor(Armor.CHAIN_MAIL)
                .hairColor(HairColor.BROWN)
                .hairStyle(HairStyle.LONG)
                .name("hero")
                .role(Role.TANK)
                .weapon(Weapon.DAGGER)
                .build();
        System.out.println(hero.toString());
    }

}
