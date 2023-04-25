package criacionais.builder;

public class MainBuilder {

    //O Builder é um padrão de projeto criacional, que permite a construção de objetos complexos passo a passo.

    public static void main(String[] args) {
        var hero = new Hero.Builder()
                .withName("Clark Kent")
                .withProfession("Journalist")
                .withHairType("Black")
                .withHairColor("Black")
                .withArmor("Cape")
                .withWeapon("Super Strength")
                .build();

        System.out.println(hero);
    }
}
