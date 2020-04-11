package AnimalAndEdible;

public abstract class Fruit implements Edible { }
class Watermelon extends Fruit {
    public String taste() {
        return "Sweet";
    }
}
class  Lemon extends  Fruit{
    public  String taste(){
        return "Sour";
    }
}
