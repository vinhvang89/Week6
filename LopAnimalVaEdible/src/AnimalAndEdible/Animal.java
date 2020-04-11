package AnimalAndEdible;

public abstract class Animal {
    public abstract String makeSound();
}
class Lion extends Animal{
    public String makeSound(){
        return "I am the King";
    }
}
class Monkey extends Animal{
    public String makeSound(){
        return "Dont worry , dont worry , your King is here";
    }
}
class Bat extends Animal implements Edible{
    public String makeSound(){
        return "I hate Superman";
    }
    public String taste(){
        return  " Corona 2019";
    }
}