package StaticPropertyPractice;

public class TestStaticProperty {
    public static void main(String[] args) {
        Hero Guangzhou = new Hero("Guangzhou","Warrior");
        Hero Thor = new Hero("Thor","God");
        Hero JohnWick = new Hero("John Wick","Assassin");
        System.out.println(Hero.numberOfHero);
    }
}
