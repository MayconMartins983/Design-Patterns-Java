package criacionais.builder;

public class Hero {

    private final String profession;
    private final String name;
    private final String hairType;
    private final String hairColor;
    private final String armor;
    private final String weapon;

    private Hero(Builder builder) {
        this.profession = builder.profession;
        this.name = builder.name;
        this.hairColor = builder.hairColor;
        this.hairType = builder.hairType;
        this.weapon = builder.weapon;
        this.armor = builder.armor;
    }

    //Getters

    public String getProfession() {
        return profession;
    }

    public String getName() {
        return name;
    }

    public String getHairType() {
        return hairType;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String getArmor() {
        return armor;
    }

    public String getWeapon() {
        return weapon;
    }

    // The builder class.

    public static class Builder {

        private String profession;
        private String name;
        private String hairType;
        private String hairColor;
        private String armor;
        private String weapon;

        // Constructor
        public Builder() {
        }

        public Builder withHairType(String hairType) {
            this.hairType = hairType;
            return this;
        }

        public Builder withProfession(String profession) {
            this.profession = profession;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withHairColor(String hairColor) {
            this.hairColor = hairColor;
            return this;
        }

        public Builder withArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder withWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }

    @Override
    public String toString() {
        return "Hero{" +
                "profession='" + profession + '\'' +
                ", name='" + name + '\'' +
                ", hairType='" + hairType + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", armor='" + armor + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
