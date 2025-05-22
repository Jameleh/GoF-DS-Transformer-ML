package main.java.designPattern;

public class Hero {

    private  String name;
    private Armor armor;
    private HairStyle hairStyle;
    private HairColor hairColor;
    private Role role;
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public Armor getArmor() {
        return armor;
    }

    public HairStyle getHairStyle() {
        return hairStyle;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public Role getRole() {
        return role;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", armor=" + armor +
                ", hairStyle=" + hairStyle +
                ", hairColor=" + hairColor +
                ", role=" + role +
                ", weapon=" + weapon +
                '}';
    }

    private  Hero(Builder builder) {
        this.name = builder.name;
        this.armor = builder.armor;
        this.hairStyle = builder.hairStyle;
        this.hairColor = builder.hairColor;
        this.role = builder.role;
        this.weapon = builder.weapon;
    }



    public static class Builder{

        private  String name;
        private Armor armor;
        private HairStyle hairStyle;
        private HairColor hairColor;
        private Role role;
        private Weapon weapon;


        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder armor(Armor armor){
            this.armor = armor;
            return this;
        }

        public Builder hairStyle(HairStyle hairStyle){
            this.hairStyle = hairStyle;
            return this;
        }

        public Builder hairColor (HairColor hairColor){
            this.hairColor = hairColor;
            return this;
        }
        public Builder role(Role role){
            this.role = role;
            return this;
        }
        public Builder weapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }

        public Hero build(){
         return new Hero(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", armor=" + armor +
                    ", hairStyle=" + hairStyle +
                    ", hairColor=" + hairColor +
                    ", role=" + role +
                    ", weapon=" + weapon +
                    '}';
        }
    }
}
