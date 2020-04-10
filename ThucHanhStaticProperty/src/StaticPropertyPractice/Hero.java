package StaticPropertyPractice;

public class Hero {
    String name ;
    String job;
    public static int numberOfHero;
    public Hero(String name , String job){
        this.name = name;
        this.job = job;
        numberOfHero++;
    }

}
